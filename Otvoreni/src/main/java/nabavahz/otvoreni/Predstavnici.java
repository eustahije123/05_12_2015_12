package nabavahz.otvoreni;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Predstavnici")
public class Predstavnici implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "IDPredstavnika")
   private java.lang.Integer IDPredstavnika;
   @org.kie.api.definition.type.Label(value = "Ime")
   private java.lang.String ime;
   @org.kie.api.definition.type.Label(value = "Prezime")
   private java.lang.String prezime;

   public Predstavnici()
   {
   }

   public java.lang.Integer getIDPredstavnika()
   {
      return this.IDPredstavnika;
   }

   public void setIDPredstavnika(java.lang.Integer IDPredstavnika)
   {
      this.IDPredstavnika = IDPredstavnika;
   }

   public java.lang.String getIme()
   {
      return this.ime;
   }

   public void setIme(java.lang.String ime)
   {
      this.ime = ime;
   }

   public java.lang.String getPrezime()
   {
      return this.prezime;
   }

   public void setPrezime(java.lang.String prezime)
   {
      this.prezime = prezime;
   }

   public Predstavnici(java.lang.Integer IDPredstavnika, java.lang.String ime,
         java.lang.String prezime)
   {
      this.IDPredstavnika = IDPredstavnika;
      this.ime = ime;
      this.prezime = prezime;
   }

}