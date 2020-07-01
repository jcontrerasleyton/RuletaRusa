package ruletarusa;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.applet.AudioClip;


public class ListenerVentana implements ActionListener {
        //Creacion del arreglo necesario para calcular el juego.
        AudioClip sonido2;
	private int jugado=1;
        int numb;
        private static int c=1;
        private int i=0;
        private int[] pistola=new int[6];
        String name;
        
	public InterfazVentana ventana;
        
	
	public ListenerVentana(InterfazVentana v){
		ventana = v;
	}
        
        
	public void actionPerformed(ActionEvent event) 
	{
		
		if(event.getSource() == ventana.jugar)
		{
                    /*Se oculta el panel 1, el panel 2 se hace visible 
                    * y se dehabilita el botÃ³n nativo de cerrar*/
                    
                    AudioClip sonido;
                    sonido=java.applet.Applet.newAudioClip(getClass().
                            getResource("/sonido/click.wav"));
                    sonido.play();
                    ventana.panelBotones.setVisible(false);
                    ventana.panelBotones2.setVisible(true);
                    ventana.setDefaultCloseOperation(0);
		}
                //Se muestra el mensaje de ayuda o de acerca de... .
                else if(event.getSource() == ventana.ayuda)
		{
                    AudioClip sonido;
                    sonido=java.applet.Applet.newAudioClip(getClass().
                            getResource("/sonido/wow.wav"));
                    sonido.play();
                    JOptionPane.showMessageDialog(null,"Como Jugar:\n\n-Al hacer click en "
                        + "\"Disparar\""
                        + " se aprieta el gatillo de la pistola, si esa recamara "
                        + "contenía una bala, el participante muere y termina el juego."
                        + "\n-\"?\" azul: Representa la recamara actual."
                        + "\n-\"?\" negro: Representa una recamara incognita, "
                        + "es decir, no se sabe si tiene una bala."
                        + "\n-\"X\" :Representa una recamara "
                        + "visitada y que no tenía una bala.\n\n!!EL JUEGO NO SE PODRA "
                        + "CERRAR HASTA QUE ALGUIEN PIERDA (Q.E.P.D)!! "); 
		}
                else if(event.getSource() == ventana.acerca)
		{
                    AudioClip sonido;
                    sonido=java.applet.Applet.newAudioClip(getClass().
                            getResource("/sonido/wow.wav"));
                    sonido.play();
                    JOptionPane.showMessageDialog(null,"__________________________\n"
                        + "Jean Luis Contreras "
                        + "Leyton\n<<jean123447@gmail.com>>\n Todos los derechos "
                        + "reservados.\n__________________________");
			
		}
                
                /*Se oculta el panel 2, el panel 3 se hace visible 
                         * y se determina el numero de jugadores*/  
                if(event.getSource() == ventana.b1){ 
                    AudioClip sonido;
                    sonido=java.applet.Applet.newAudioClip(getClass().
                            getResource("/sonido/click.wav"));
                    sonido.play();
                    ventana.panelBotones2.setVisible(false);
                    ventana.panelBotones3.setVisible(true);
                    numb=1;
                }
                if(event.getSource() == ventana.b2){
                    AudioClip sonido;
                    sonido=java.applet.Applet.newAudioClip(getClass().
                            getResource("/sonido/click.wav"));
                    sonido.play();
                    ventana.panelBotones2.setVisible(false);
                    ventana.panelBotones3.setVisible(true);
                    numb=2;
                }
                if(event.getSource() == ventana.b3){
                    AudioClip sonido;
                    sonido=java.applet.Applet.newAudioClip(getClass().
                            getResource("/sonido/click.wav"));
                    sonido.play();
                    ventana.panelBotones2.setVisible(false);
                    ventana.panelBotones3.setVisible(true);
                    numb=3;
                }
                if(event.getSource() == ventana.b4){
                    AudioClip sonido;
                    sonido=java.applet.Applet.newAudioClip(getClass().
                            getResource("/sonido/click.wav"));
                    sonido.play();
                    ventana.panelBotones2.setVisible(false);
                    ventana.panelBotones3.setVisible(true);
                    numb=4;
                }
                if(event.getSource() == ventana.b5){
                    AudioClip sonido;
                    sonido=java.applet.Applet.newAudioClip(getClass().
                            getResource("/sonido/click.wav"));
                    sonido.play();
                    ventana.panelBotones2.setVisible(false);
                    ventana.panelBotones3.setVisible(true);
                    numb=5;
                }
                if(event.getSource() == ventana.b6){
                    AudioClip sonido;
                    sonido=java.applet.Applet.newAudioClip(getClass().
                            getResource("/sonido/click.wav"));
                    sonido.play();
                    ventana.panelBotones2.setVisible(false);
                    ventana.panelBotones3.setVisible(true);
                    numb=6;
                }
                if(event.getSource() == ventana.ayudar){   
                    AudioClip sonido;
                    sonido=java.applet.Applet.newAudioClip(getClass().
                            getResource("/sonido/wow.wav"));
                    sonido.play();
                    JOptionPane.showMessageDialog(null,"Como Jugar:\n\n-Al hacer click en "
                        + "\"Disparar\""
                        + " se aprieta el gatillo de la pistola, si esa recamara "
                        + "contenía una bala, el participante muere y termina el juego."
                        + "\n-\"?\" azul: Representa la recamara actual."
                        + "\n-\"?\" negro: Representa una recamara incognita, "
                        + "es decir, no se sabe si tiene una bala."
                        + "\n-\"X\" :Representa una recamara "
                        + "visitada y que no tenÃ­a una bala.\n\n!!EL JUEGO NO SE PODRA "
                        + "CERRAR HASTA QUE ALGUIEN PIERDA (Q.E.P.D)!! "); 
                }
                //Simula el juego con un arreglo.
                if(event.getSource() == ventana.gatillo){
                    AudioClip sonido0;
                    sonido0=java.applet.Applet.newAudioClip(getClass().
                            getResource("/sonido/noammo.wav"));
                    sonido0.play();
                    int rand=ventana.rand;
                    for (i=0; i<6;i++){
                        pistola[i]=i+1;
                    }
                    pistola[rand]=0;
                    for (i=0; i<6;i++){
                        System.out.println(pistola[i]);
                    }
                    if (pistola[jugado-1]==0){
                        /*Se hace invisibre el panel3, se cambia el texto de 
                         * nombre por el de name y se hace visible el panel4.
                         */ 
                        ventana.sonido.stop();
                        AudioClip sonido;
                        sonido=java.applet.Applet.newAudioClip(getClass().
                                getResource("/sonido/bala.wav"));
                        sonido.play();
                        sonido2=java.applet.Applet.newAudioClip(getClass().
                                getResource("/sonido/heaven.wav"));
                        sonido2.play();
                        ventana.panelBotones3.setVisible(false);
                        name=("Jugador "+c);
                        ventana.nombre.setFont(new java.awt.Font("Tahoma", 0, 20));
                        ventana.nombre.setText(" "+name);
                        ventana.panelBotones4.setVisible(true);
                    }
                    else{
                        /*cambia el texto de jugador por el numero del jugador 
                         * siguiente dependiendo del numero de jugadores (numb) 
                         * y de la casilla que se ha verifido.*/
                        if(numb==2){
                            c++;
                            if(c==3)
                                c=1;
                            ventana.jugador.setText("Jugador "+c);
                        }
                        if(numb==3){
                           c++;
                            if(c==4)
                                c=1;
                            ventana.jugador.setText("Jugador "+c);
                        }
                        if(numb==4){
                            c++;
                            if(c==5)
                                c=1;
                            ventana.jugador.setText("Jugador "+c);
                        }
                        if(numb==5){
                            c++;
                            if(c==6)
                                c=1;
                            ventana.jugador.setText("Jugador "+c); 
                        }
                        if(numb==6){
                            c++;
                            if(c==7)
                                c=1;
                            ventana.jugador.setText("Jugador "+c);
                        }
                        /*Cambia los colores de las casillas dejando la siguiente 
                            de color azul y el texto de esos labels 
                            * por X si no hay bala en esa casilla.*/
                        if (jugado==1){
                            ventana.o1.setForeground(Color.black); 
                            ventana.o1.setText("X"); 
                            ventana.o2.setForeground(Color.blue.brighter()); 
                        }
                        if (jugado==2){   
                            ventana.o2.setForeground(Color.black); 
                            ventana.o2.setText("X"); 
                            ventana.o3.setForeground(Color.blue.brighter()); 
                        }
                        if (jugado==3){
                            ventana.o3.setForeground(Color.black); 
                            ventana.o3.setText("X");
                            ventana.o4.setForeground(Color.blue.brighter()); 
                        }
                        if (jugado==4){
                            ventana.o4.setForeground(Color.black); 
                            ventana.o4.setText("X"); 
                            ventana.o5.setForeground(Color.blue.brighter()); 
                        }
                        if (jugado==5){
                            ventana.o5.setForeground(Color.black); 
                            ventana.o5.setText("X");   
                            ventana.o6.setForeground(Color.blue.brighter()); 
                        }
                        jugado++;           
                    }
                }
                if(event.getSource() == ventana.salir){
                    System.exit(0); //Se cierra el programa.
                }
                if(event.getSource() == ventana.menu){
                    /*Se cierra el panelBotones4, se cierra la ventana y se abre
                     * una nueva.*/
                    sonido2.stop();
                    ventana.dispose();
                    InterfazVentana v1= new InterfazVentana();
                    v1.setVisible(true);
                }

	}

	
	
}
