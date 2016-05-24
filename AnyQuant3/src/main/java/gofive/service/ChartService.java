package gofive.service;

import gofive.vo.ConclusionVO;
import gofive.vo.chart.DataList;

public interface ChartService {

	
	/**
	 * ��ȡĳֻ��Ʊ���ܽ���Ϣ������ָ�����Ϣ�������ܽ���Ϣ
	 * @param id	��ƱID
	 * @param date	��Ҫ��õ�����
	 * @return
	 */
	public ConclusionVO getStatisticsConclusion(String id,String date);
	
	/**
	 * ��ȡ�����ͼ����Ϣ
	 * @param id
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public DataList[] getSwingList(String id,String startTime,String endTime);
	
	/**
	 * ��ȡ�ɽ�����ͼ����Ϣ
	 * @param id
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public DataList[] getVolumeList(String id,String startTime,String endTime);
	
}
