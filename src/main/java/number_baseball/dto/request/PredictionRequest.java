package number_baseball.dto.request;

public class PredictionRequest {
		private int value;

		public PredictionRequest() {
		}

		public PredictionRequest(int value) {
				this.value = value;
		}

		public int getValue() {
				return value;
		}

		public void setValue(int value) {
				this.value = value;
		}
}
