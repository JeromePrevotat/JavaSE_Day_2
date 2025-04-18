package com.humanbooster.exercices;

public class Personne {
    /**
     * Personne is composed of 2 Strings <nom> & <prenom> which can't be empty and an Integer <age> which must be Positive.
     */
    private String nom;
    private String prenom;
    private int age;

    /**
     * Number of Instances 
     */
    public static int nbPersonne;

    public Personne(){nbPersonne++;}

    public Personne(String nom, String prenom, int age) throws Exception{
        if ((nom == null) || nom.trim().equals("")) throw new IllegalArgumentException("Invalid value for <nom>: can't be empty");
        if ((prenom == null) || prenom.trim().equals("")) throw new IllegalArgumentException("Invalid value for <prenom>: can't be empty");
        if (age < 0) throw new IllegalArgumentException("Invalid value for <age>: can't be negative");
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        nbPersonne++;
    }

    // GETTERS
    /**
     * Get the Personne's lastname.
     * @return Returns a non empty String : the Personne's lastname.
     */
    public String getNom(){
        return this.nom;
    }

    /**
     * Get the Personne's name.
     * @return Returns a non empty String : the Personne's name.
     */
    public String getPrenom(){
        return this.prenom;
    }

    /**
     * Get the Personne's age.
     * @return Returns a Positive Integer : the Personne's age.
     */
    public int getAge(){
        return this.age;
    }

    // SETTERS
    /**
     * Set the Personne's lastname.
     * @param nom Takes a String : the Personne's lastname. Cannot be Empty.
     */
    public void setNom(String nom) throws Exception{
        if (nom == null || nom.trim().equals("")) throw new IllegalArgumentException("Invalid value for <nom>: can't be empty");
        this.nom = nom;
    }

    /**
     * Set the Personne's name.
     * @param prenom Takes a String : the Personne's name. Cannot be Empty.
     */
    public void setPrenom(String prenom) throws Exception{
        if (prenom == null || prenom.trim().equals("")) throw new IllegalArgumentException("Invalid value for <prenom>: can't be empty");
        this.prenom = prenom;
    }

    /**
     * Set the Personne's age.
     * @param age Takes an Integer : the Personne's age. Must be Positive.
     */
    public void setAge(int age) throws Exception{
        if (age < 0) throw new IllegalArgumentException("Invalid value for <age>: can't be negative");
        this.age = age;
    }

    // Number of Instances
    /**
     * Returns the number of Personne Instanced.
     * @return An Integer Positive or Nul.
     */
    public static int getNbPersonne(){
        return nbPersonne;
    }

    /**
     * Returns a String representation of a Personne.
     * @return A String representing the Personne's Attributes.
     */
    @Override
    public String toString(){
        return (nom + " " + prenom + " " + age + " ans");
    }
}
