package Package;


// Clavier.java
// Premiere version developpee par Didier Ferment: 
//                 objet a instancier systematiquement
// Modification par Cyrille Randrianamaro
//                 possibilite de ne pas instancier
// Puis Changement de nom pour TP algo UE1 MIAS: G. Richomme
// 29 janvier 2002-12 f�vrier 2002: G. Richomme (avec aide D. Ferment)
//         Modifications des commentaires. 
//         suppression de la possibilit� d'instancier la classe.
//         disparition de l'attribut instance
//         mise en private de la fonction initialise
//         ajout de la m�thode lireLigne
//         tentative de flushTotal mais Probleme.
//         mise en private des flush() car inutile pour etudiants
// Cr�ation javadoc:
// javadoc -d DocClavier -nodeprecated -nodeprecatedlist -nohelp -notree 
//           -noindex -nonavbar Clavier.java

//import Serie1.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Cette classe a pour but de fournir des outils de base pour la 
 * saisie de valeurs de certains type de base. <BR><BR>
 * Elle a �t� initialement �crite pour la mise en place des TPs de
 * JAVA dans les modules d'initiation � la programmation de DEUG MIAS 
 * premi�re ann�e a l'universit� de Picardie Jules Verne. <BR><BR>
 * Toutes les m�thodes propos�es dans la classe Clavier 
 * sont des m�thodes de classe (seules m�thodes vues au premier semestre).
 * La mani�re d'utiliser ces m�thodes 
 *   est illustr�e par l'exemple suivant&nbsp;:
 * <pre>
 *    int valeur ;                   // d�claration de la variable 
 *    ...
 *    valeur = Clavier.lireInt();    // saisie de la valeur
 *    ...
 * </pre>
 * <BR>
 * <b>Avertissement 1</b>. La classe Clavier doit, � priori, 
 *    �tre pr�sente dans le 
 *    r�pertoire d'utilisation 
 *    � moins que (<i>Aspect Avanc�s (hors programme premi�re ann�e)</i>)
 *   le r�pertoire dans lequel elle est pr�sente 
 *   ne soit pr�cis� dans la variable d'environnement CLASSPATH
 *   ou dans l'option -classpath des commandes.<bR><BR>
 * <b>Avertissement 2</b>. La classe ne fonctionne qu'� partir de la 
 *     version 1.2 de JAVA.<bR><bR>
 * <b>Avertissement 3</b>.  Toutes les m�thodes (� l'exception de lireLigne)
 *        propos�es dans cette classe 
 *        ne tiennent pas compte des s�parateurs 
 *        (espace, tabulation, retour chariot = passage � la ligne) 
 *        pour r�cup�rer de l'information. (C'est ce qui se passe dans 
 *        beaucoup d'autres langages de programmation 
 *        (par exemple langage C, langage Pascal)).<br>
 *    On appelle <b>entit�</b> toute suite de caract�res cons�cutifs
 *    diff�rents de l'espace, de la tabulation ou du retour chariot.<br><br>
 * <b>Informations pour ceux qui cherchent � comprendre</b> 
 * (<i>Aspects Avanc�s (hors programme premi�re ann�e)</i>).
 *  <ul>
 *  <li> Lorsque des caract�res sont tap�s au clavier, ils sont
 *       au fur et � mesure stock�s dans un coin de la m�moire 
 *       appel� <i>tampon</i> (ou <i>buffer</i>).</li>
 *  <li> La mani�re de remplissage du tampon permet de corriger la frappe 
 *        tant qu'on n'a pas fait de "retour chariot" (touche Entr�e).</li>
 *  <li> Lorsqu'on demande une information � l'utilisateur, on cherche cette
 *        information dans le tampon, quitte � attendre qu'il se remplisse.</li>
 *  <li> La saisie au clavier ou l'analyse de l'information cherch�e peut 
 *          g�n�rer des erreurs (de type IOExceptions en JAVA).
 *          Elles sont g�r�es au minimum (on sort du programme).</li>
 *  </ul>
 */

/* Remarque. 
    Les commentaires du code pr�sente des aspects avanc�s de programmation 
    (hors programme premi�re ann�e) */
public final class Clavier {

    /* L'objet buffer: l'initialisation � la valeur null permet de 
     * savoir plus tard que l'objet n'a pas �t� instanci�.
     */
    private static BufferedReader bufIn = null;   

    /* L'objet pour analyser le buffer. On parle d'analyseur lexical. */
    private static StringTokenizer st = null;  

    /**
     * Le fait de mettre en private le constructeur rend 
     * la classe non instanciable. <BR>
     * Il n'y a qu'un clavier!
     */
    private Clavier() {}


    /**
     * Initialise le buffer.<bR>
     * Les donn�es sont saisies par d�faut au clavier 
     * (souvent appel� entr�e standard et not� stdin)
     * Cette action (l'allocation) n'est ex�cut�e qu'une fois. <BR>
     * Cette fonction est appel�e lors de chaque lecture (via la fonction
     * read().
     *
     */
    private static void initialise() {
      if (bufIn == null)
        bufIn= new BufferedReader(new InputStreamReader(System.in));
      }

    /* Lecture d'une information dans le buffer */
    private static void read()  {
	if (bufIn == null)   // Ce test ne peut �tre vrai qu'une fois
	    initialise();    // d�finition du buffer 
	try {          
	    String s = bufIn.readLine();    // Lecture d'une ligne du buffer
	    st = new StringTokenizer(s);    // Instanciation objet d'analyse
	} catch (IOException e) {
	    System.err.println("read" + " " + e.getMessage());
	    System.exit(2); // Une erreur s'est produite, on sort du programme.
	}
    }



    /**
     * vide le tampon (buffer), en supprimant les caract�res tap�s 
     * jusqu'a cette instruction. <br>
     * Entre deux demandes d'information, l'utilisateur peut tapoter sur le 
     * clavier. En faisant appel a flush() avant la saisie d'une information,
     * cela permet de ne pas tenir compte de ce "tapotage".
     * BUG RECENSE. Ne vire pas ce qui reste dans le buffer de
     *     plus bas niveau stdin.
     */
    private static void flushTotal() {
        st = null;
	bufIn = null ;
    }

    /**
     * vide partiellement le tampon (buffer), 
     * en supprimant les caract�res tap�s non utilis�s sur la derni�re ligne. 
     * <br>
     * Pour �viter de saisir des informations tap�es malencontreusement.
     */
    private static void flush() {
        st = null;
    }

    /** analyse la prochaine entit� dans le buffer comme une constante
     * de type int (entier). <BR>
     * Les espaces, tabulations et sauts de lignes sont "pass�s".
     * La lecture attend l'arriv�e d'autres caract�res dans le buffer. <br>
     * @return    le nombre lu de type int
     * @exception NumberFormatException
     * erreur si la prochaine entit� n'est pas de type int.
     */
    public static int lireInt()  {
	if (st == null)
	    read();
	while (! st.hasMoreTokens())
	    read();
	String ss = st.nextToken();
	int i = Integer.parseInt(ss);
	return(i);
    }

    /** analyse la prochaine entit� dans le buffer comme une constante
     * de type long (entier). <BR>
     * Les espaces, tabulations et sauts de lignes sont "pass�s".
     * La lecture attend l'arriv�e d'autres caract�res dans le buffer. <br>
     * @return    le nombre lu de type long
     * @exception NumberFormatException
     * erreur si la prochaine entit� n'est pas de type long
     */
    public static long lireLong()  {
	if (st == null)
	    read();
	while (! st.hasMoreTokens())
	    read();
	String ss = st.nextToken();
	long i = Long.parseLong(ss);
	return(i);
    }

    /** analyse la prochaine entit� dans le buffer comme une constante
     * de type float (r�el flottant). <BR>
     * Les espaces, tabulations et sauts de lignes sont "pass�s".
     * La lecture attend l'arriv�e d'autres caract�res dans le buffer. <br>
     * @return    le nombre lu de type float
     * @exception NumberFormatException
     * erreur si la prochaine entit� n'est pas de type float
     */
    public static float lireFloat()  {
	if (st == null)
	    read();
	while (! st.hasMoreTokens())
	    read();
	String ss = st.nextToken();
	float f = Float.parseFloat(ss);
	return(f);
    }

    /** analyse la prochaine entit� dans le buffer comme une constante
     * de type double (r�el flottant en double pr�cision). <BR>
     * Les espaces, tabulations et sauts de lignes sont "pass�s".
     * La lecture attend l'arriv�e d'autres caract�res dans le buffer. <br>
     * @return    le nombre lu de type double
     * @exception NumberFormatException
     * erreur si la prochaine entit� n'est pas de type double
     */
    public static double lireDouble()  {
	if (st == null)
	    read();
	while (! st.hasMoreTokens())
	    read();
	String ss = st.nextToken();
	double f = Double.parseDouble(ss);
	return(f);
    }

    /** analyse la prochaine entit� dans le buffer comme une constante
     * de type chaine de caract�res. <BR>
     * Les espaces, tabulations et sauts de lignes sont "pass�s".
     * La lecture attend l'arriv�e d'autres caract�res dans le buffer. <br>
     * En particulier, on ne peut pas saisir une cha�ne vide, ou
     *    une cha�ne avec des espaces.
     * @return    la chaine de caract�res lue de type String
     */
    public static String lireString()  {
	if (st == null)
	    read();
	while (! st.hasMoreTokens())
	    read();
	return(st.nextToken());
    }

    /** Retourne la cha�ne compos�e de tous les caract�res rencontr�s
     * jusqu'au prochain retour chariot. <BR>
     * Permet de saisir une cha�ne vide, ou
     *    une cha�ne avec des espaces.
     * Si une information (par exemple un entier) a d�j� �t� r�cup�r�e, 
     *     ne donne que la fin de la ligne (� partir du premier caract�re, 
     *     apr�s l'information, diff�rent de l'espace et de la tabulation).
     * @return    la chaine de caract�res lue de type String
     */
    public static String lireLigne()  {
	String s = "" ;
	if ((st == null) || (!st.hasMoreTokens()))
	{
	    if(bufIn == null) 
		initialise() ;
	    try{
		s = bufIn.readLine() ;
	    } catch (IOException e) {
		System.err.println("lireString" + " " + e.getMessage());
		System.exit(2); // Une erreur s'est produite, on sort du programme.
	    }
	    return s ;
	}
	else
	{
	    System.out.println("Autre cas") ;
	    return(st.nextToken(System.getProperty("line.separator")));
	}
    }
}
