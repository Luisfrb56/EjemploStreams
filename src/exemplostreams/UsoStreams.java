
package exemplostreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;


public class UsoStreams {
    
    List<Alumno>listaAlumnos=new ArrayList();
    List<Alumno>suspensos;
    public void crearLista(){
        listaAlumnos.add(new Alumno("111","Ana","dam1",4));
        listaAlumnos.add(new Alumno("222","Ana","dam1",8));
        listaAlumnos.add(new Alumno("333","Anton","dam2",6));
        listaAlumnos.add(new Alumno("444","Brais","fpb",5));
        listaAlumnos.add(new Alumno("555","Alex","dam1",3));
        listaAlumnos.add(new Alumno("666","Noa","adm",7));
    }
    
    public void amosar(){
        
//        for(Alumno al:listaAlumnos)

//            System.out.println(al);

//Usando Streams

listaAlumnos.stream().forEach(al->System.out.println(al));

        //Utilizando referencia a metodos.
        
//        listaAlumnos.stream().forEach(System.out::println);

        }
    public void amosarAlumnoDeterminado(){
        
        listaAlumnos.stream().filter(al->al.getNome().charAt(0)=='A').forEach(al->System.out.println(al));
            
            }
    public void aprobados(){
        
        listaAlumnos.stream().filter(al->al.getNota()>=5).forEach(al->System.out.println(al));
        
    }        
    
    public void listaSuspensos(){
        suspensos=(ArrayList<Alumno>) listaAlumnos.stream().filter((al)->al.getNota()<5).collect(Collectors.toList());
        
        
    }
    public void amosarSuspensos(){
        suspensos.stream().forEach(al->System.out.println(al));
    }       
        public void buscarAlumno(){
            
            String pedirDNI=JOptionPane.showInputDialog("Dime el dni?", null);
        listaAlumnos.stream().filter(al->al.getDni().matches(pedirDNI)).forEach(al->System.out.println(al));
        
    }
        
        public void subirNota(){
//            listaAlumnos.stream().min((al1,al2)).;
            listaAlumnos.stream().map((al)->al.getNota()+2).forEach(al->System.out.println(al));
            
        }
        public void subirNotaAprobador(){
            listaAlumnos.stream().filter(al->al.getNota()>=5).map((al)->al.getNota()+1).forEach(al->System.out.println(al));
                    }
    }
         

