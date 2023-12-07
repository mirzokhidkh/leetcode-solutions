select t.actor_id, t.director_id
from ActorDirector t
group by t.actor_id, t.director_id
having count(*) > 2;
