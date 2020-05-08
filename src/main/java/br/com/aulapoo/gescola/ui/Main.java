/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aulapoo.gescola.ui;

import br.com.aulapoo.gescola.entity.Curso;
import br.com.aulapoo.gescola.entity.Disciplina;
import br.com.aulapoo.gescola.entity.Pessoa;
import br.com.aulapoo.gescola.entity.Professor;
import br.com.aulapoo.gescola.util.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author psychoid
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    // teste
    
    public static void main(String args[]) {
        
        
        
        Session session = null;
        Transaction tx = null;
        HibernateUtil h = new HibernateUtil();
        
        //
        //Criando um objeto e salvando no banco de dados
        //
        /*
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        
        Pessoa pess = new Pessoa();
        pess.setDataNascimento(new Date("04/01/2000"));
        pess.setNome("Mikhaell");
        pess.setSigno("Transformer");
        
        session.save(pess);
        tx.commit();
        */
        
        
        
        //
        // Retornando dados do banco de dados e criando objetos como resultado
        //
        /*
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        
        Pessoa px = (Pessoa) session.get(Pessoa.class, 1);
        
        System.out.println(px.getNome());
        System.out.println(px.getDataNascimento().toString());

        tx.commit();
        */
        
        
        
        //
        // Atualizando dados 
        //
        /*
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        
        Pessoa px = (Pessoa) session.get(Pessoa.class, 1);
        px.setNome("Mikhaell Reis");
        
        session.update(px);
        
        tx.commit();
        */
        
        
        
        //
        // Deletando registros
        //
        /*
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        
        Pessoa px = (Pessoa) session.get(Pessoa.class, 1);
       
        session.delete(px);
        
        tx.commit();
        */
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }
    
}
