import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.ProjetoPratico;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.ProjetoPratico;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        ProjetoPratico projeto = new ProjetoPratico();
        projeto.setTitulo("Projeto Prático de Java");
        projeto.setDescricao("Descrição do projeto prático de Java");
        projeto.setDificuldade(3);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(projeto);

        Dev devLuan = new Dev();
        devLuan.setNome("Luan");
        devLuan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Luan:" + devLuan.getConteudosInscritos());

        // Progredir uma vez
        devLuan.progredir();
        System.out.println("Após progredir 1 vez:");
        System.out.println("Conteúdos Inscritos Luan:" + devLuan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Luan:" + devLuan.getConteudosConcluidos());
        System.out.println("XP:" + devLuan.calcularTotalXp());

        // Progredir mais uma vez
        devLuan.progredir();
        System.out.println("Após progredir 2 vezes:");
        System.out.println("Conteúdos Inscritos Luan:" + devLuan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Luan:" + devLuan.getConteudosConcluidos());
        System.out.println("XP:" + devLuan.calcularTotalXp());

        // Progredir mais uma vez
        devLuan.progredir();
        System.out.println("Após progredir 3 vezes:");
        System.out.println("Conteúdos Inscritos Luan:" + devLuan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Luan:" + devLuan.getConteudosConcluidos());
        System.out.println("XP:" + devLuan.calcularTotalXp());

        // Progredir mais uma vez
        devLuan.progredir();
        System.out.println("Após progredir 4 vezes:");
        System.out.println("Conteúdos Inscritos Luan:" + devLuan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Luan:" + devLuan.getConteudosConcluidos());
        System.out.println("XP:" + devLuan.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());

        // Progredir uma vez
        devJoao.progredir();
        System.out.println("Após progredir 1 vez:");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        // Progredir mais uma vez
        devJoao.progredir();
        System.out.println("Após progredir 2 vezes:");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        // Progredir mais uma vez
        devJoao.progredir();
        System.out.println("Após progredir 3 vezes:");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}
