package ruletarusa;

//Jean Luis Contreras Leyton
import java.applet.AudioClip;
import java.awt.*;


import javax.swing.*;

public class InterfazVentana extends JFrame {
	//Constructor ventana
        public int rand= (int)(Math.random()*6); 
        AudioClip sonido;
        public JPanel superPanel;//Contine otros 3 paneles (Panel principal) 
        
        //---------------------------Panel 1----------------------------------
        public JPanel panelBotones;/*Panel donde irÃ¡n los botone, labels y fondos.*/
        public JLabel fondo; //En el se agregara una imagen.
        public JLabel ruleta;//Titulo del juego
        
	public JButton jugar;//Botón con el cual se accede al juego.
	public JButton ayuda;//Botón de ayuda.
        public JButton acerca;//Botón sobre el creador del programa.
        
        //---------------------------Panel 2----------------------------------
        public JPanel panelBotones2;//Similar a panelBotones
        public JLabel jugadores;//Titulo del panel
        public JLabel fondo2;//Fondo del panel
        
        //Botones del 1 al 6.
        public JButton b1;
        public JButton b2;
        public JButton b3;
        public JButton b4;
        public JButton b5;
        public JButton b6;
        
        //---------------------------Panel 3---------------------------------- 
        public JPanel panelBotones3;//Similar a panelBotones.
        public JLabel jugador; //Label con el numero del jugador.
        public JLabel fondo3;//Fondo panel.
        public JLabel tambor;//Imagen del tambor.
        public JLabel diseno;//fondo panel 2.
        
        public JLabel disparar;//Label con la palabra "disparar".
        public JButton gatillo;//Botón 
        public JButton ayudar;
        
        //Representacion de cada casilla del tambor. (labels)
        public JLabel o1;
        public JLabel o2;
        public JLabel o3;
        public JLabel o4;
        public JLabel o5;
        public JLabel o6;
        
        //---------------------------Panel 3---------------------------------- 
        public JPanel panelBotones4;//Similar a panelBotones.
        
        public JButton salir;//Botón que termina el programa.
        public JButton menu;//Botón que abre una nueva ventana.
        
        public JLabel murio;//Label con texto.
        public JLabel nombre;//Label con numero jugador.
        public JLabel alas;//Label con imagen de alas.
        public JLabel aureola;//Label con imagen de aureola.
        public JLabel fondo4;//Fondo panel.
        
	public InterfazVentana(){
                
		super( "Ruleta Rusa" );
                

		setSize( 400, 325 );
                this.setResizable(false);
                Image icon = new ImageIcon(getClass().getResource("/imagenes/icono.jpg")).getImage();
                this.setIconImage(icon);
                superPanel = new JPanel();
                this.setLocationRelativeTo(null);
                setDefaultCloseOperation(javax.swing.WindowConstants.
                        EXIT_ON_CLOSE);
                sonido=java.applet.Applet.newAudioClip(getClass().getResource("/sonido/epic.wav"));
                sonido.play();
                
                superPanel.setLayout(null);
                //______________________Panel 1 ____________________________

                //Se crean los botones y labels.
                ruleta= new JLabel();
		panelBotones = new JPanel();
                fondo = new JLabel();
		panelBotones.setLayout(null);/*Es null para poder poner los 
                    elementos donde yo quiera.*/
                
                //Se crean los 3 botones de este panel.
		jugar = new JButton();
		ayuda = new JButton();
                acerca = new JButton();
		
                
                /*Se crea un botón con dos iconos, uno normal y otro cuando el 
                cursor en forma de mano pasa sobre el.*/
                jugar.setIcon(new ImageIcon(getClass().getResource
                        ("/imagenes/disparo.gif")));
                jugar.setRolloverIcon(new ImageIcon(getClass().
                        getResource("/imagenes/disparo2.gif")));
                jugar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panelBotones.add(jugar);
                jugar.setBounds(163 , 130 ,74,74); 
                jugar.setBorder(null);
                
                //Se les da una función a los botones.
		ListenerVentana v = new ListenerVentana(this);
		jugar.addActionListener(v);
		ayuda.addActionListener(v);
                acerca.addActionListener(v);
                
                /*Se crean dos botones con fondo cyan e igual tamaño*/
                ayuda.setText("Ayuda");
                ayuda.setForeground(new Color(255, 255, 255));
                ayuda.setBackground(Color.cyan.darker().darker());
                acerca.setText("Acerca de...");
                acerca.setForeground(new Color(255, 255, 255));
                acerca.setBackground(Color.cyan.darker().darker());
                
                /*Label con el nombre del titulo con tamaño y color determinado*/
                ruleta.setFont(new Font("Tahoma", 0, 25)); 
                ruleta.setForeground(new Color(255, 255, 255));
                ruleta.setText("RULETA RUSA");
                panelBotones.add(ruleta);
                ruleta.setBounds(120, 15, 200, 23);
                
                //Se añaden los botones al panel
                panelBotones.add(ayuda);
                ayuda.setBounds(15, 240, 110, 23);
                 
                panelBotones.add(acerca);
                acerca.setBounds(270, 240, 110, 23);

                //Se añade un fondo.
                fondo.setIcon(new ImageIcon(getClass().getResource
                        ("/imagenes/fondo.jpg")));
                panelBotones.add(fondo);
                fondo.setBounds(0, 0, 400, 300);
     
                //Todo lo anterior se añade al superpanel
		superPanel.add(panelBotones);
                panelBotones.setBounds(0 , 0 ,
                     400, 300); 
                
                
                setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible( true );
                
                
		
                //__________________Panel 2____________________________
                
                //Se crean los botones y labels.
                panelBotones2 = new JPanel();
                fondo2 = new JLabel();
                jugadores = new JLabel();
                panelBotones2.setLayout(null);/*Es null para poder poner los 
                 * elementos donde yo quiera.*/

                //Se crean los bototnes
                b1 = new JButton();
		b2 = new JButton();
                b3 = new JButton();
                b4 = new JButton();
		b5 = new JButton();
                b6 = new JButton();
                
                //Y se les da una función
		b1.addActionListener(v);
		b2.addActionListener(v);
                b3.addActionListener(v);
                b4.addActionListener(v);
		b5.addActionListener(v);
                b6.addActionListener(v);
                
                /*Label con el nombre del titulo con tamaño y color determinado*/
                jugadores.setFont(new Font("Tahoma", 0, 24)); 
                jugadores.setForeground(new Color(255, 255, 255));
                jugadores.setText("Elige numero de jugadores");
                panelBotones2.add(jugadores);
                jugadores.setBounds(50, 0, 290, 50);
                
                /*Se formatean los botones y se agregan al panelBotones2 
                 * con un numero, tamaño, cursor y color de letra determinado*/
                b1.setFont(new Font("Tahoma", 0, 36)); 
                b1.setText("1");
                b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panelBotones2.add(b1);
                b1.setBounds(80, 120, 56, 56);
                
                b2.setFont(new Font("Tahoma", 0, 36)); 
                b2.setText("2");
                b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panelBotones2.add(b2);
                b2.setBounds(170, 120, 56, 56);
                
                b3.setFont(new Font("Tahoma", 0, 36)); 
                b3.setText("3");
                b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panelBotones2.add(b3);
                b3.setBounds(260, 120, 56, 56);
                
                b4.setFont(new Font("Tahoma", 0, 36)); 
                b4.setText("4");
                b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panelBotones2.add(b4);
                b4.setBounds(80, 190, 56, 56);
                
                b5.setFont(new Font("Tahoma", 0, 36)); 
                b5.setText("5");
                b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panelBotones2.add(b5);
                b5.setBounds(170, 190, 56, 56);
                
                b6.setFont(new Font("Tahoma", 0, 36)); 
                b6.setText("6");
                b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panelBotones2.add(b6);
                b6.setBounds(260, 190, 56, 56);
                
                //Se le cambian los colores a los botones por naranjo
                b1.setBackground(Color.orange);
                b2.setBackground(Color.orange);
                b3.setBackground(Color.orange);
                b4.setBackground(Color.orange);
                b5.setBackground(Color.orange);
                b6.setBackground(Color.orange);
                
                //Se agrega fondo.
                fondo2.setIcon(new ImageIcon(getClass().getResource
                        ("/imagenes/jugadores.png"))); 
                panelBotones2.add(fondo2);
                fondo2.setBounds(0, 0, 400, 300);
                
                //Todo lo anterior se añade al superpanel
                superPanel.add(panelBotones2);
                panelBotones2.setBounds(0 , 0 ,
                     400, 300); 
                panelBotones2.setVisible(false);
                
                
                
                
                //______________________Panel 3______________________________
                
                //Se crean los botones y labels.
                panelBotones3 = new JPanel();
                fondo3 = new JLabel();
                jugador = new JLabel();
                tambor = new JLabel();
                gatillo= new JButton();
                ayudar= new JButton();
                diseno=new JLabel();
                disparar=new JLabel();
                panelBotones3.setLayout(null);//null para libertad.
               
                /*Se añade a panelbotones3 los Label con un texto, 
                 * tamaño de texto, color y tamaño. */
                jugador.setFont(new Font("Tahoma", 0, 24)); 
                jugador.setForeground(new Color(255, 255, 255));
                jugador.setText("Jugador 1");
                panelBotones3.add(jugador);
                jugador.setBounds(10, 10, 110, 30);
                
                disparar.setFont(new Font("Tahoma", 0, 14)); // NOI18N
                disparar.setForeground(new Color(255, 255, 255));
                disparar.setText("Disparar");
                panelBotones3.add(disparar);
                disparar.setBounds(290, 270, 50, 20);
                
                ayudar.setToolTipText("Ayuda"); 
                ayudar.setIcon(new ImageIcon(getClass().getResource
                        ("/imagenes/botonAyuda2.png")));
                ayudar.setCursor(new Cursor(Cursor.HAND_CURSOR));
                ayudar.setRolloverIcon(new ImageIcon(getClass().
                        getResource("/imagenes/botonAyuda.png")));
                panelBotones3.add(ayudar);
                ayudar.setBorder(null);
                ayudar.setBounds(340, 10, 40, 40);
                
                
                /*Se añade el botón gatillo que posee un determinado cursor, 
                 * tamaño e iconos (normal, cursor encima y presionado). */
                gatillo.setIcon(new ImageIcon(getClass().getResource
                        ("/imagenes/boton2.png"))); // NOI18N
                gatillo.setCursor(new Cursor(Cursor.HAND_CURSOR));
                gatillo.setPressedIcon(new ImageIcon(getClass().
                        getResource("/imagenes/boton3.png"))); // NOI18N
                gatillo.setRolloverIcon(new ImageIcon(getClass().
                        getResource("/imagenes/bala.png"))); // NOI18N
                panelBotones3.add(gatillo);
                gatillo.setBorder(null);
                gatillo.setBounds(350, 250, 40, 40);
                
                //Se añade una fondo panelBotones3.
                diseno.setIcon(new ImageIcon(getClass().getResource
                        ("/imagenes/capa.png"))); // NOI18N
                panelBotones3.add(diseno);
                diseno.setBounds(0, 0, 400, 300);
                
                //Se le añade funcionalidad al botón.
                gatillo.addActionListener(v);
                ayudar.addActionListener(v);
                /*Se crean los labels que representan cas casillas de tambor
                 * con tamaño, texto, y tamaño de texto. */
                o1 = new JLabel ();
		o2 = new JLabel ();
                o3 = new JLabel ();
                o4 = new JLabel ();
		o5 = new JLabel ();
                o6 = new JLabel ();

                o1.setFont(new Font("Tahoma", 0, 48)); 
                o1.setText("?");
                panelBotones3.add(o1);
                o1.setBounds(150, 80, 30, 48);
                
                o2.setFont(new Font("Tahoma", 0, 48)); 
                o2.setText("?");
                panelBotones3.add(o2);
                o2.setBounds(220, 80, 30, 48);
                
                o3.setFont(new Font("Tahoma", 0, 48));
                o3.setText("?");
                panelBotones3.add(o3);
                o3.setBounds(260, 140, 30, 48);
                
                o4.setFont(new Font("Tahoma", 0, 48)); 
                o4.setText("?");
                panelBotones3.add(o4);
                o4.setBounds(230, 200, 30, 48);
                
                o5.setFont(new Font("Tahoma", 0, 48)); 
                o5.setText("?");
                panelBotones3.add(o5);
                o5.setBounds(160, 200, 30, 48);
                
                o6.setFont(new Font("Tahoma", 0, 48)); 
                o6.setText("?");
                panelBotones3.add(o6);
                o6.setBounds(120, 140, 34, 48);
                
                //Se le cambia el color al primer label.
                o1.setForeground(Color.blue.brighter());
                
                //Se añade la imagen del tambor a panelBotones3
                tambor.setIcon(new ImageIcon(getClass().getResource
                        ("/imagenes/tambor.png")));
                panelBotones3.add(tambor);
                tambor.setBounds(80, 50, 240, 230);
                
                //Se añade otro fondo a panelBotones.
                fondo3.setIcon(new ImageIcon(getClass().getResource
                        ("/imagenes/texture_fossil.png"))); 
                panelBotones3.add(fondo3);
                fondo3.setBounds(0, 0, 400, 300);
                
                //todo lo anterior se añade a superPanel.
                superPanel.add(panelBotones3);
                panelBotones3.setBounds(0 , 0 ,
                     400, 300); 
                
                //Se hace invisible para que sea visto en el momento necesario.
                panelBotones3.setVisible(false);
                
                
                //_____________________Ventana 4_________________________
                
                //Se crean los botones y labels.
                panelBotones4 = new JPanel();
                murio = new JLabel();
                nombre = new JLabel();
                alas = new JLabel();
                salir = new JButton();
                menu = new JButton();
                aureola = new JLabel();
                fondo4 = new JLabel();
                
                panelBotones4.setLayout(null);//null para libertad.
                
                //Se ñaden los botones salir y menu con color, texto y tamaño".
                salir.setText("Salir");
                salir.setFont(new Font("Tahoma", 0, 16));        
                salir.setCursor(new Cursor(Cursor.HAND_CURSOR));
                panelBotones4.add(salir);
                salir.setBounds(40, 260, 100, 23);
                
                menu.setText("Volver a menu");
                menu.setFont(new Font("Tahoma", 0, 16));
                menu.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
                panelBotones4.add(menu);
                menu.setBounds(220, 260, 140, 23);
                
                panelBotones4.add(nombre);
                nombre.setBounds(150, 80, 100, 40);
                
                //Se formatea y añade el label murio con texto y tamaño.
                murio.setFont(new Font("Tahoma", 0, 48)); // NOI18N
                murio.setText("Ha muerto");
                panelBotones4.add(murio);
                murio.setBounds(90, 190, 230, 58);
                
                salir.addActionListener(v);
                menu.addActionListener(v);
                
                //Se añaden las alas al panelBotones4.
                alas.setIcon(new ImageIcon(getClass().getResource
                        ("/imagenes/alas.png"))); 
                panelBotones4.add(alas);
                alas.setBounds(60, 30, 290, 220);
                
                //Se añade la aureola al panelBotones4.
                aureola.setIcon(new ImageIcon(getClass().getResource
                        ("/imagenes/aureola.png"))); 
                panelBotones4.add(aureola);
                aureola.setBounds(150, 10, 100, 40);
                
                //Se añadene el fondo al panelBotones4.
                fondo4.setIcon(new ImageIcon(getClass().getResource
                        ("/imagenes/nubes.jpg"))); 
                panelBotones4.add(fondo4);
                fondo4.setBounds(0, 0, 400, 300);
        

                //todo lo anterior se añade a superPanel.
                superPanel.add(panelBotones4);
                panelBotones4.setBounds(0 , 0 ,
                     400, 300); 
                
                //Se hace invisible para que sea visto en el momento necesario.
                panelBotones4.setVisible(false);
                
                
                add(superPanel);
                superPanel.setVisible(true);
                
                
                setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible( true );
                
	} // fin del constructor de InterfazVentana

}