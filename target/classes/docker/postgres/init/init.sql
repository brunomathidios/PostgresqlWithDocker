create database if not exists delivery;

CREATE SEQUENCE public.std_user_id_user_seq;

CREATE TABLE public.delivery_user
(
    id_user integer NOT NULL DEFAULT nextval('std_user_id_user_seq'::regclass),
    nm_user character varying(150) COLLATE pg_catalog."default" NOT NULL,
    login_user character varying(20) COLLATE pg_catalog."default",
    pwd_user character varying COLLATE pg_catalog."default",
    CONSTRAINT pk_user PRIMARY KEY (id_user)
)
