package br.com.nutellatux.remedyWeb.servicos;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.ScheduleExpression;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;

@Singleton
@Startup	
public class Agendador { //TODO Ver Depois como Funciona

	@Resource
	private TimerService timerService;


	@PostConstruct
	public void posConstrucao() {
		timerService.createTimer(10000L, "timeout"); // CERTO !!
	}

	@Timeout
	public void agendado(Timer timer) {
		ScheduleExpression	expression	=	new	ScheduleExpression();
		
		expression.hour("*");	
		expression.minute("*/1");	//igual	ao	"15,30,45"
		// chamado pelo container periodicamente
	}

	// //toda segundas 9hs da manhã
	// ScheduleExpression expression = new ScheduleExpression();
	// expression.dayOfWeek("Mon");
	// expression.hour("9");
	// //qualquer hora aos 40min
	// ScheduleExpression expression = new ScheduleExpression();
	// expression.hour("*");
	// expression.minute("40");
	// //as 9 e 18 horas cada 15 minutos
	// ScheduleExpression expression = new ScheduleExpression();
	// expression.hour("9,18");
	// expression.minute("*/15"); //igual ao "15,30,45"
	// //entre 2 e 4 horas nos minutos 30,35,40,45,50,55
	// ScheduleExpression expression = new ScheduleExpression();
	// expression.hour("2-4");
	// expression.minute("30/5");
	// Podemos até configurar os segundos, timezone ou algum dia específico no mês.
	// Mais exemplos se
	// encontram na documentação da classe ScheduleExpression :
	// http://download.oracle.com/javaee/7/api/javax/ejb/ScheduleExpression.html
	// Podemos até configurar os segundos, timezone ou algum dia específico no mês.
	// Mais exemplos se
	// encontram na documentação da classe ScheduleExpression :
	// http://download.oracle.com/javaee/7/api/javax/ejb/ScheduleExpression.html

}
