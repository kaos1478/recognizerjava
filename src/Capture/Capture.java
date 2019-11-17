
package Capture;

import Util.ConectaBanco;
import Util.ControlPerson;
import Util.ModelPerson;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import org.bytedeco.javacpp.BytePointer;
import static org.bytedeco.opencv.global.opencv_core.CV_32SC1;
import static org.bytedeco.opencv.global.opencv_imgcodecs.imencode;
import static org.bytedeco.opencv.global.opencv_imgcodecs.imread;
import static org.bytedeco.opencv.global.opencv_imgcodecs.imwrite;
import org.bytedeco.opencv.global.opencv_imgproc;
import static org.bytedeco.opencv.global.opencv_imgproc.COLOR_BGRA2GRAY;
import static org.bytedeco.opencv.global.opencv_imgproc.cvtColor;
import static org.bytedeco.opencv.global.opencv_imgproc.rectangle;
import org.bytedeco.opencv.opencv_core.Mat;
import org.bytedeco.opencv.opencv_core.MatVector;
import org.bytedeco.opencv.opencv_core.Rect;
import org.bytedeco.opencv.opencv_core.RectVector;
import org.bytedeco.opencv.opencv_core.Scalar;
import org.bytedeco.opencv.opencv_core.Size;
import org.bytedeco.opencv.opencv_face.FaceRecognizer;
import org.bytedeco.opencv.opencv_face.LBPHFaceRecognizer;
import org.bytedeco.opencv.opencv_objdetect.CascadeClassifier;
import org.bytedeco.opencv.opencv_videoio.VideoCapture;

public class Capture extends javax.swing.JFrame {
    
    private Capture.DaemonThread myThread = null;
    
    //JavaCV
    VideoCapture webSource = null;
    Mat cameraImage = new Mat();
    CascadeClassifier cascade = new CascadeClassifier("C:\\photos\\haarcascade_frontalface_alt.xml");
    BytePointer mem = new BytePointer();
    RectVector detectedFaces = new RectVector();
    
    
    //Vars
    
    String root, firstNamePerson, lastNamePerson, officePerson, dobPerson;
    int numSamples = 25, sample = 1, idPerson;
    
    //Utils
    
    ConectaBanco conecta = new ConectaBanco();
    
    
  

    public Capture(int id, String fName, String LName, String office, String dob) {
        initComponents();
        
        idPerson = id; 
        firstNamePerson = fName;
        lastNamePerson = LName;
        officePerson = office;
        dobPerson = dob;
        
        RegisterPerson rp = new RegisterPerson();
        
        startCamera();
        
    }

    private Capture() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_photo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        counterLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        saveButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Segurança - Capturar Fotos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAPTURAR 25 SNAPSHOTS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 375, 40));

        label_photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        jPanel1.add(label_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, 360, 363));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        counterLabel.setBackground(new java.awt.Color(98, 141, 206));
        counterLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        counterLabel.setForeground(new java.awt.Color(255, 255, 255));
        counterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        counterLabel.setText("00");
        counterLabel.setOpaque(true);
        jPanel2.add(counterLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 80, 40));

        saveButton.setBackground(new java.awt.Color(106, 171, 128));
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Capturar");
        saveButton.setContentAreaFilled(false);
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveButton.setOpaque(true);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel2.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 100, -1));

        btn_voltar.setBackground(new java.awt.Color(98, 141, 206));
        btn_voltar.setForeground(new java.awt.Color(255, 255, 255));
        btn_voltar.setText("Voltar Menu");
        btn_voltar.setContentAreaFilled(false);
        btn_voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_voltar.setOpaque(true);
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 130, -1));

        saveButton1.setBackground(new java.awt.Color(106, 171, 128));
        saveButton1.setForeground(new java.awt.Color(255, 255, 255));
        saveButton1.setText("Voltar menu");
        saveButton1.setContentAreaFilled(false);
        saveButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveButton1.setOpaque(true);
        saveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(saveButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 360, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        setBounds(0, 0, 396, 570);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
      
    }//GEN-LAST:event_saveButtonActionPerformed

    private void saveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton1ActionPerformed
        stopCamera();
        dispose();
    }//GEN-LAST:event_saveButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Capture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Capture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Capture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Capture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Capture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel counterLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_photo;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton saveButton1;
    // End of variables declaration//GEN-END:variables

    class DaemonThread implements Runnable {

        protected volatile boolean runnable = false; // cria a variavel de forma que sempre seja disponibilizada o valor atualizado

        @Override
        public void run() {
            synchronized (this) { // Responsável por criar uma fila de execução
                while (runnable) {
                    try {
                        if (webSource.grab()) { //Verifica se existe uma camera no pc
                            webSource.retrieve(cameraImage); //Captura imagem
                            Graphics g = label_photo.getGraphics(); //pega o conteudo grafico do componente (que contem a imagem)
                            Mat imageColor = new Mat();// Instancia a lib Mat (opencv) responsavel por pegar os parametros da imagem
                            imageColor = cameraImage; //pega os parametros da imagem

                            Mat imageGray = new Mat(); //instancia a lib mat novamente para pegar a imagem em preto e branco
                            cvtColor(imageColor, imageGray, COLOR_BGRA2GRAY); //pega a imagem captura e torna ela preto e branco

                            RectVector detectedFaces = new RectVector(); // Instancia a lib responsável pelo reconhecimento facial
                            cascade.detectMultiScale(imageColor, detectedFaces, 1.1, 1, 1, new Size(150, 150), new Size(500, 500)); // Executa a classe classificadora por cascata

                            for (int i = 0; i < detectedFaces.size(); i++) { // se classificar
                                Rect dadosFace = detectedFaces.get(0); // Salva os dados da detecção
                                rectangle(imageColor, dadosFace, new Scalar(255, 255, 0, 2),3, 0, 0); // Responsável por fazer a triangulação do rosto afim de detectar caracteristicas
                                Mat face = new Mat(imageGray, dadosFace);  // Vincula as caracteristicas encontradas com a imagem
                                opencv_imgproc.resize(face, face, new Size(160, 160)); // Modifica o tamanho da imagem

                                if (saveButton.getModel().isPressed()) { // pega o evento do botao

                                    if (sample <= numSamples) { // Se tiver capturado
                                        String cropped = "C:\\photos\\person." + idPerson + "." + sample + ".jpg"; // especifica a pasta a ser salva
                                        imwrite(cropped, face); // salva na pasta

                                        //System.out.println("Foto " + amostra + " capturada\n");
                                        counterLabel.setText(String.valueOf(sample) + "/25");
                                        sample++; // Aumenta o valor da quantidade de capturas
                                    }
                                    if (sample > 25) { // se a quantidade atingiu o limite termina
                                        trainPhotos();
                                        insertDatabase();
                                        System.out.println("Dados Gravados com sucesso...");
                                        stopCamera();
                                    }
                                }
                            }

                            imencode(".bmp", cameraImage, mem); // /change na imagem mudando sua extenção e pega o valor em bit
                            Image im = ImageIO.read(new ByteArrayInputStream(mem.getStringBytes())); //Le bit a bit a lista de array e salva
                            BufferedImage buff = (BufferedImage) im; // implementa a imagem de acordo com os bits encontrados

                            if (g.drawImage(buff, 0, 0, 360, 390, 0, 0, buff.getWidth(), buff.getHeight(), null)) { // se conseguir ler a imagem
                                if (runnable == false) { // e ja tiver terminado a captura
                                    System.out.println("Salve a Foto");
                                    this.wait();
                                }
                            }
                        }

                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Erro ao iniciar camera (IOEx)\n" + ex);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Erro ao iniciar camera (Interrupted)\n" + ex);
                    }
                }
            }
        }
    }
    
    //Metodo de treinamento do Reconhecimento Facial.
    
        public void trainPhotos() {
        File directory = new File("C:\\photos\\"); // caminho onde será gravado a imagem (opcional)
        FilenameFilter filter = (File dir, String name1) -> name1.endsWith(".jpg") || name1.endsWith(".png"); // a extensao das imagens a serem salvas

        File[] files = directory.listFiles(filter); // lista as capturas e coloca no files
        MatVector photos = new MatVector(files.length);
        Mat labels = new Mat(files.length, 1, CV_32SC1); //Cria o label de apresentacao
        IntBuffer labelsBuffer = labels.createBuffer();

        int counter = 0;
        for (File image : files) { //Percorre todas as imagens
            Mat photo = imread(image.getAbsolutePath(), COLOR_BGRA2GRAY); //le cada imagem de passa para cinza
            int idP = Integer.parseInt(image.getName().split("\\.")[1]); //pega o id de cada imagem
            opencv_imgproc.resize(photo, photo, new Size(160, 160)); // Muda o tamanho da imagem

            photos.put(counter, photo); //coloca o id e a foto na list
            labelsBuffer.put(counter, idP); //coloca o id da foto e o id do registro na list
            counter++; // id ganha mais 1
        }

        LBPHFaceRecognizer lbph = LBPHFaceRecognizer.create(1, 8, 8, 8, 12); //chama o reconhecedor de faces
        lbph.train(photos, labels); // sequencia a foto e label
        lbph.save("C:\\photos\\classifierLBPH.yml");//chama o classificador
    }
    
 // Metodo utilizado para gravar informações no banco de dados.
        //Tabela Person (Personagem)
        
    public void insertDatabase(){
        
        ControlPerson cod = new ControlPerson();
        ModelPerson mod = new ModelPerson();
        
        mod.setId(idPerson);
        mod.setFirst_name(firstNamePerson);
        mod.setLast_name(lastNamePerson);
        mod.setDob(dobPerson);
        mod.setOffice(officePerson);
        cod.inserir(mod);   
    }
    
// metodo utilizado para pausar a camera.
    
    public void stopCamera(){
        myThread.runnable = false;
        webSource.release(); // objeto WebSource definido como null 
        dispose(); // fechar janela atual, sem finalizar o programa
    }
    

// metodo utilizado por executar a camera.
    
    public void startCamera() {
        new Thread() {
            @Override
            public void run() {
                webSource = new VideoCapture(0);

                myThread = new Capture.DaemonThread();
                Thread t = new Thread(myThread);
                t.setDaemon(true);
                myThread.runnable = true;
                t.start();
            }
        }.start();
    }

}
