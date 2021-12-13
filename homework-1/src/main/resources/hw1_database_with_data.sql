--
-- PostgreSQL database dump
--

-- Dumped from database version 13.3
-- Dumped by pg_dump version 13.3

-- Started on 2021-12-13 22:45:58

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 205 (class 1259 OID 25272)
-- Name: category; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.category (
    id bigint NOT NULL,
    breakdown bigint,
    name character varying(50),
    top_category_id bigint
);


ALTER TABLE public.category OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 25264)
-- Name: category_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.category_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.category_id_seq OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 25277)
-- Name: product; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.product (
    id bigint NOT NULL,
    category_id bigint,
    created_date timestamp without time zone,
    price numeric(19,2),
    name character varying(50)
);


ALTER TABLE public.product OWNER TO postgres;

--
-- TOC entry 207 (class 1259 OID 25282)
-- Name: product_comment; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.product_comment (
    id bigint NOT NULL,
    comment character varying(500),
    comment_date timestamp without time zone,
    product_id bigint,
    user_id bigint
);


ALTER TABLE public.product_comment OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 25266)
-- Name: product_comment_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.product_comment_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.product_comment_id_seq OWNER TO postgres;

--
-- TOC entry 203 (class 1259 OID 25268)
-- Name: product_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.product_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.product_id_seq OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 25259)
-- Name: user; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."user" (
    id bigint NOT NULL,
    cell_phone character varying(15),
    email character varying(50),
    first_name character varying(50),
    last_name character varying(50)
);


ALTER TABLE public."user" OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 25270)
-- Name: user_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.user_id_seq OWNER TO postgres;

--
-- TOC entry 3012 (class 0 OID 25272)
-- Dependencies: 205
-- Data for Name: category; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.category (id, breakdown, name, top_category_id) FROM stdin;
1	1	Moda	\N
2	1	Elektronik	\N
3	1	Ev & Yaşam	\N
4	2	Elbise	1
5	2	Gömlek	1
6	2	Bilgisayar	2
7	3	Dizüstü Bilgisayar	6
8	2	Mobilya	3
9	3	Sehpa	8
\.


--
-- TOC entry 3013 (class 0 OID 25277)
-- Dependencies: 206
-- Data for Name: product; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.product (id, category_id, created_date, price, name) FROM stdin;
1	4	2021-12-07 22:13:17.144464	200.00	Mavi Elbise
2	4	2021-12-07 22:13:57.964379	300.00	Kırmızı Elbise
3	5	2021-12-07 22:13:57.964379	500.00	Mavi Gömlek
4	5	2021-12-07 22:13:57.964379	450.00	Sarı Gömlek
5	7	2021-12-07 22:13:57.964379	15000.00	HP 
6	7	2021-12-07 22:13:57.964379	20000.00	MSI
7	9	2021-12-07 22:13:57.964379	600.00	Orta Sehpa
\.


--
-- TOC entry 3014 (class 0 OID 25282)
-- Dependencies: 207
-- Data for Name: product_comment; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.product_comment (id, comment, comment_date, product_id, user_id) FROM stdin;
2	Phasellus maximus euismod volutpat. Mauris ullamcorper suscipit venenatis.	2021-12-07 22:39:45.376106	2	1
3	Aliquam scelerisque rutrum tristique. Vivamus massa purus, bibendum posuere aliquet a, congue eget magna.	2021-12-07 22:39:45.376106	3	2
4	Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam convallis elit ligula, non pulvinar arcu semper in. Sed massa lacus, lobortis eget varius id, imperdiet eget enim.	2021-12-07 22:39:45.376106	4	3
5	Maecenas vitae consequat metus.	2021-12-07 22:39:45.376106	2	4
7	Phasellus maximus euismod volutpat. Mauris ullamcorper suscipit venenatis.	2021-12-07 22:39:45.376106	3	2
8	Aliquam scelerisque rutrum tristique. Vivamus massa purus, bibendum posuere aliquet a, congue eget magna.	2021-12-07 22:39:45.376106	1	1
9	Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam convallis elit ligula, non pulvinar arcu semper in. Sed massa lacus, lobortis eget varius id, imperdiet eget enim.	2021-12-07 22:39:45.376106	2	4
10	Maecenas vitae consequat metus.	2021-12-07 22:39:45.376106	2	3
11	Phasellus leo justo, facilisis a metus a, ultricies egestas arcu.	2021-12-07 22:39:45.376106	1	2
12	Phasellus maximus euismod volutpat. Mauris ullamcorper suscipit venenatis.	2021-12-07 22:39:45.376106	3	4
13	Aliquam scelerisque rutrum tristique. Vivamus massa purus, bibendum posuere aliquet a, congue eget magna.	2021-12-07 22:39:45.376106	2	3
1	FİYAT PERFORMANS AÇISINDAN GÜZEL BİR BİLGİSAYAR	2021-12-07 22:39:45.376106	1	1
6	Phasellus leo justo, facilisis a metus a, ultricies egestas arcu.	2021-12-07 22:39:45.376106	1	2
14	Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam convallis elit ligula, non pulvinar arcu semper in. Sed massa lacus, lobortis eget varius id, imperdiet eget enim.	2021-12-07 22:39:45.376106	3	2
15	Maecenas vitae consequat metus.	2021-12-07 22:39:45.376106	4	3
16	Phasellus leo justo, facilisis a metus a, ultricies egestas arcu.	2021-12-07 22:39:45.376106	3	4
\.


--
-- TOC entry 3007 (class 0 OID 25259)
-- Dependencies: 200
-- Data for Name: user; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."user" (id, cell_phone, email, first_name, last_name) FROM stdin;
1	+90123456789	asimkilic@patika.dev	ASIM	KILIÇ
2	+90119653789	james@patika.dev	JAMES	GOSLING
3	+90158366789	dennis@patika.dev	DENNIS	RITCHIE
4	+90123446289	linus@patika.dev	LINUS	TORVALDS
5	+9052221212	example@example.com	Rick	Anderson
\.


--
-- TOC entry 3020 (class 0 OID 0)
-- Dependencies: 201
-- Name: category_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.category_id_seq', 1, false);


--
-- TOC entry 3021 (class 0 OID 0)
-- Dependencies: 202
-- Name: product_comment_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.product_comment_id_seq', 1, false);


--
-- TOC entry 3022 (class 0 OID 0)
-- Dependencies: 203
-- Name: product_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.product_id_seq', 1, false);


--
-- TOC entry 3023 (class 0 OID 0)
-- Dependencies: 204
-- Name: user_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.user_id_seq', 1, false);


--
-- TOC entry 2872 (class 2606 OID 25276)
-- Name: category category_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.category
    ADD CONSTRAINT category_pkey PRIMARY KEY (id);


--
-- TOC entry 2876 (class 2606 OID 25289)
-- Name: product_comment product_comment_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.product_comment
    ADD CONSTRAINT product_comment_pkey PRIMARY KEY (id);


--
-- TOC entry 2874 (class 2606 OID 25281)
-- Name: product product_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.product
    ADD CONSTRAINT product_pkey PRIMARY KEY (id);


--
-- TOC entry 2870 (class 2606 OID 25263)
-- Name: user user_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."user"
    ADD CONSTRAINT user_pkey PRIMARY KEY (id);


-- Completed on 2021-12-13 22:45:59

--
-- PostgreSQL database dump complete
--

