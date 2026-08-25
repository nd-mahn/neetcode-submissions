-- Write your query below
SELECT DISTINCT ON (student_id)
 student_id,
 exam_id,
 score
  from  exam_results
order by student_id,score desc,exam_id asc