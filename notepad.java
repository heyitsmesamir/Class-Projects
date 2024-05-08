import javax.swing.*;
class notepad
{   
    JFrame f;
    JMenu file,edit,format,view,help,zoom;
    JMenuItem f1,f2,f3,f4,f5,f6,f7,f8;
    JMenuItem e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13;
    JMenuItem fr1,fr2;
    JMenuItem v1;
    JMenuItem h1,h2,h3;
    JMenuItem z1,z2,z3;
    notepad(){
        f = new JFrame("Samir Thapa - Notepad");
        JMenuBar mb =new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        format = new JMenu("Format");
        view = new JMenu("View");
        help = new JMenu("Help");
        zoom = new JMenu("Zoom");
         f1 = new JMenuItem("New       Ctrl + N");//Gaps to make shortcuts look aligned in the output//
         f2 = new JMenuItem("New Window\t\t Ctrl + Shift + N");
         f3 = new JMenuItem("Open                            Ctrl + O");
         f4 = new JMenuItem("Save                             Ctrl + S");
         f5 = new JMenuItem("Save as                       Ctrl + Shift + S");
         f6 = new JMenuItem("Page Setup");
         f7 = new JMenuItem("Print                             Ctrl + P");
         f8 = new JMenuItem("Exit");
         e1 = new JMenuItem("Undo                              Ctrl + Z");
         e2 = new JMenuItem("Cut                                  Ctrl + X");
         e3 = new JMenuItem("Copy                               Ctrl + C");
         e4 = new JMenuItem("Paste                             Ctrl + V");
         e5 = new JMenuItem("Delete                            Del");
         e6 = new JMenuItem("Search with Bing        Ctrl + E");
         e7 = new JMenuItem("Find                                Ctrl + F");
         e8 = new JMenuItem("Find Next                       F3");
         e9 = new JMenuItem("Find Previous              Shift + F3");
         e10 = new JMenuItem("Replace                        Ctrl + H");
         e11 = new JMenuItem("Go To                             Ctrl + G");
         e12 = new JMenuItem("Select All                      Ctrl + A");
         e13 = new JMenuItem("Time/Date                     F5 ");
         fr1 = new JMenuItem("Word Warp");
         fr2 = new JMenuItem("Font");
         v1 = new JMenuItem("Status Bar");
         h1 = new JMenuItem("View Help");
         h2 = new JMenuItem("Send Feedback");
         h3 = new JMenuItem("About Notepad");
         z1 = new JMenuItem("Zoom In                                 Ctrl + Plus");
         z2 = new JMenuItem("Zoom Out                              Ctrl + Minus");
         z3 = new JMenuItem("Restore Default Zoom       Ctrl + 0");
         
         file.add(f1);
         file.add(f2);
         file.add(f3);
         file.add(f4);
         file.add(f5);
         file.add(f6);
         file.add(f7);
         file.add(f8);
         edit.add(e1);
         edit.add(e2);
         edit.add(e3);
         edit.add(e4);
         edit.add(e5);
         edit.add(e6);
         edit.add(e7);
         edit.add(e8);
         edit.add(e9);
         edit.add(e10);
         edit.add(e11);
         edit.add(e12);
         edit.add(e13);
         format.add(fr1);
         format.add(fr2);
         view.add(v1);
         help.add(h1);
         help.add(h2);
         help.add(h3);
         zoom.add(z1);
         zoom.add(z2);
         zoom.add(z3);
         view.add(zoom);
         mb.add(file);
         mb.add(edit);
         mb.add(format);
         mb.add(view);
         mb.add(help);
         f.setJMenuBar(mb);
         f.setSize(400,400);
         f.setLayout(null);
         f.setVisible(true);
    }
    public static void main(String args[])
    {
        new notepad();
    }}






