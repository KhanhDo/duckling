(
 {}
 
 "090-421-1814"
 "0904223444"
 "09142334322"
 "+85 241821422"
 "+84 4 76095663"
 "04 2070 2220"
 "(650)-283-4757 ext 897"
 (fn [token _] (and (= :phone-number (:dim token))
                    (= (:text token) (:val token))))
 
 "http://www.bla.com"
 "www.bla.com:8080/path"
 "https://myserver?foo=bar"
 "cnn.com/info"
 "bla.com/path/path?ext=%23&foo=bla"
 "localhost"
 "localhost:8000"
 "http://kimchi" ; local url
 (fn [token _] (and (= :url (:dim token))
                    (= (:text token) (:val token))))
 
 "alex@wit.ai"
 "alex.lebrun@mail.wit.com"
 (fn [token _] (and (= :email (:dim token))
                    (= (:text token) (:val token))))
 
 )
