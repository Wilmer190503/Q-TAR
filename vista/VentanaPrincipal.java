package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
        //----------
    // Atributos
    //----------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    public DialogoDirector miDialogoDirector;
    public DialogoJugador miDialogoJugador;

    //----------
    // Metodos
    //----------

    /*Método constructor*/
    public VentanaPrincipal()
    {
        //Contenedor de la ventana
        this.setLayout(null);

        // Crear y agregar el PanelEntrada
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,570,150);
        this.add(miPanelEntradaDatos);

        // Crear y agregar el PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,170,570,100);
        this.add(miPanelOperaciones);

        // Crear y agregar el PanelEntrada
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,280,570,290);
        this.add(miPanelResultados);
        
        miDialogoDirector = null;
        
        

        // Caracteristicas de la ventana
        this.setTitle("FIFA");
        this.setSize(600,600);
        //this.setLocation(100,100);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void crearDialogoDirector()
    {
        miDialogoDirector = new DialogoDirector();
    }
    
    public void crearDialogoJugador()
    {
        miDialogoJugador = new DialogoJugador();
    }
    
}
