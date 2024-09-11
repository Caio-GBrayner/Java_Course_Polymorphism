package entities;
import java.util.ArrayList;
import java.util.List;

public class Employee {

		private String name;
		protected Integer hours;
		protected Double valuePerHour;
		
		protected List<Employee> workers = new ArrayList<>();
		
		public Employee() {
		}

		public Employee(String name, Integer hours, Double valuePerHour) {
			this.name = name;
			this.hours = hours;
			this.valuePerHour = valuePerHour;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getHours() {
			return hours;
		}

		public void setHours(Integer hours) {
			this.hours = hours;
		}

		public Double getValuePerHour() {
			return valuePerHour;
		}

		public void setValuePerHour(Double valuePerHour) {
			this.valuePerHour = valuePerHour;
		}
		
		public double payment() {
			return valuePerHour * hours;
		}
		
		public  void addWorker(Employee worker) {
			workers.add(worker);
		}
		public String toString() {
			StringBuilder sb = new StringBuilder();
			for(Employee e : workers) {
				sb.append(e.getName() +"- $"+ String.format("%.2f", e.payment()) + "\n");
			}
			return sb.toString();
		}
		
	}


