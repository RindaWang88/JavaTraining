package observer;

public interface Subject {
	/**
	 * ע��۲���
	 * @param observer
	 */
	public void registerObserver(Observer observer);
	
	/**
	 * ɾ���۲���
	 * @param observer
	 */
	public void removeOberver(Observer observer);
	
	/**
	 * ������״̬�����ı�ʱ�����������Ҫ�����ã���֪ͨ���й۲���
	 */
	public void notifyObserver();
}