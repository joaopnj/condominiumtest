package joao.groupsoftware;

import joao.groupsoftware.calculations.MathResults;
import joao.groupsoftware.condominium.Apartament;
import joao.groupsoftware.model.CondominumEntity;
import joao.groupsoftware.model.ResidentEntity;
import joao.groupsoftware.model.UnityEntity;
import joao.groupsoftware.repository.CondominiumRepository;
import joao.groupsoftware.repository.ResidentRepository;
import joao.groupsoftware.repository.UnityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@SpringBootApplication
public class GroupsoftwareApplication {

	public static void main(String[] args) {
        SpringApplication.run(GroupsoftwareApplication.class, args);
	}

    @Bean
    public CommandLineRunner exe1() {
        return args -> {

            // Exercício 1
            MathResults mathResults = new MathResults();

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("------------------");
            System.out.println("Digite o valor do lado do quadrado");
            Double squareSide = Double.parseDouble(in.readLine());

            mathResults.squareArea(squareSide);

            System.out.println("------------------");
            System.out.println("Digite o valor da base do retangulo");
            Double baseRetangule = Double.parseDouble(in.readLine());
            System.out.println("Digite o valor da altura do retangulo");
            Double heightRetangule = Double.parseDouble(in.readLine());

            mathResults.retanguleArea(baseRetangule, heightRetangule);

            System.out.println("------------------");
            System.out.println("Digite o valor do raio do circulo");
            Double radiusCircule = Double.parseDouble(in.readLine());

            mathResults.circuleArea(radiusCircule);

            System.out.println("------------------");
            System.out.println("Digite o valor da base do triangulo");
            Double baseTriangule = Double.parseDouble(in.readLine());
            System.out.println("Digite o valor da altura do triangulo");
            Double heightTriangule = Double.parseDouble(in.readLine());

            mathResults.trianguleArea(baseTriangule, heightTriangule);

        };
    }

    @Bean
    public CommandLineRunner exe2() {
        return args -> {

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            Apartament apartament = new Apartament();

            System.out.println("-------------------------");

            System.out.println("Digite a área total do condominio");
            apartament.setTotalArea(Double.parseDouble(in.readLine()));

            System.out.println("-------------------------");

            System.out.println("Digite a área do apartamento em questão");
            apartament.setUnityArea(Double.parseDouble(in.readLine()));

            System.out.println("-------------------------");

            System.out.println("Digite a área total construída das unidades");
            apartament.setTotalUnitysArea(Double.parseDouble(in.readLine()));

            System.out.println("-------------------------");

            System.out.println("Digite as dispesas do bloco");
            apartament.setTotalOfDispenses(Double.parseDouble(in.readLine()));

            System.out.println("-------------------------");

            System.out.println("O valor do condomínio é: "+apartament.condominiumValue());


        };
    }

    @Bean
    public CommandLineRunner exe3(CondominiumRepository condominiumRepository,
                                      ResidentRepository residentRepository,
                                      UnityRepository unityRepository) {
        return args -> {
            System.out.println("Criando condominio");
            CondominumEntity condominumEntity = condominiumRepository.save(new CondominumEntity("Ceu claro", "Rua 1"));
            System.out.println("Criando unidade");
            UnityEntity unityEntity = unityRepository.save(new UnityEntity(24L,condominumEntity));
            System.out.println("Criando unidade");
            ResidentEntity residentEntity = residentRepository.save(new ResidentEntity("José", "Da Silva", unityEntity));

        };
    }
}
