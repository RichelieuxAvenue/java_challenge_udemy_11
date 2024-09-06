public class Main {
    /*
    Calculateur d’Aire

Écrivez une méthode appelée area avec un paramètre de type double nommé radius.
La méthode doit retourner une valeur de type double qui représente l’aire d’un cercle.

Si le paramètre radius est négatif, retournez -1.0 pour indiquer une valeur invalide.

Écrivez une autre méthode surchargée avec 2 paramètres x et y (tous deux de type double), où x et y représentent les côtés d’un rectangle.
La méthode doit retourner l’aire du rectangle.

Si l’un ou les deux paramètres sont négatifs, retournez -1.0 pour indiquer une valeur invalide.

Formules et valeur de PI :

	•	Aire d’un cercle :  \text{Aire} = \pi \times \text{radius}^2
	•	Aire d’un rectangle :  \text{Aire} = x \times y

Exemples d’entrée/sortie :

	•	area(5.0); → devrait retourner 78.53981633974483 ou 78.53981
	•	area(-1); → devrait retourner -1 car le paramètre est négatif.
	•	area(5.0, 4.0); → devrait retourner 20.0 (car  5 \times 4 = 20 )
	•	area(-1.0, 4.0); → devrait retourner -1 car le premier paramètre est négatif.

NOTE : Toutes les méthodes doivent être définies comme public static, comme nous l’avons fait jusqu’à présent dans le cours.
NOTE : N’ajoutez pas de méthode main au code de la solution.
     */
    public static double aireCercle(double rayon){
        if (rayon < 0){
            return -1.0;
        }
        double aireCercleCalcul = Math.PI * Math.pow(rayon, 2);
        return aireCercleCalcul;
    }
    public static double aireRectangle(double cote1, double cote2){
        if (cote1 < 0 || cote2 < 0){
            return -1.0;
        }
        double aireRectangleCalcul = cote1 * cote2;
        return aireRectangleCalcul;
    }
    public static int aireRectangle(int cote1, int cote2){
        if (cote1 < 0 || cote2 < 0){
            return -1;
        }
        int aireRectangleCalcul = cote1 * cote2;
        return aireRectangleCalcul;
    }
}
