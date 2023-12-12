select distinct t.author_id as id from Views t
where t.author_id = t.viewer_id
order by id
