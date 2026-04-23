class University{
	
	static String[] getCoursesByCollegeName(String collegeName){
		System.out.println("College Name:" + collegeName);
		if(collegeName==null){
			System.out.println("College Name is not null..Invalid..");
			return null;
		}
		          if(collegeName=="Christ University, Bengaluru"){
			String[] courses = {"BA, BSc, BCom, BBA, BCA, MBA, Law"};
			return courses;
		}
		          if(collegeName=="St.Josephs College of Commerce, Bengaluru"){
			String[] courses = {};
			return courses;
		}
		         if(collegeName=="Ramaiah Institute of Technology, Bengaluru"){
			String[] courses = {""};
			return courses;
		}
		        if(collegeName=="Dayananda Sagar College of Engineering, Bengaluru"){
			String[] courses = {"CSE, IT, Mechanical, Civil, EEE, AI & ML"};
			return courses;
		}
				if(collegeName=="RNS Institute of Technology, Bengaluru"){
			String[] courses = {"CSE, Civil, Mechanical, ECE, AI & Data Science"};
			return courses;
		}
				if(collegeName=="Siddaganga Institute of Technology, Tumkur"){
			String[] courses = {"CSE, Civil, Mechanical, ECE"};
			return courses;
		}
				if(collegeName=="Alliance University, Bengaluru"){
			String[] courses = {"BBA, MBA, BA, BSc, Law"};
			return courses;
		}
				if(collegeName=="CMR University, Bengaluru"){
			String[] courses = {"BTech, MBA, BBA, BSc, Law"};
			return courses;
		}
				if(collegeName=="Reva University, Bengaluru"){
			String[] courses = {"BTech, MBA, BBA, BCom, BSc"};
			return courses;
		}
				if(collegeName=="PES University, Bengaluru"){
			String[] courses = {"BTech, MTech, MCA"};
			return courses;
		}
				if(collegeName=="Azim Premji University, Bengaluru"){
			String[] courses = {"BA, BEd, MA Education"};
			return courses;
		}
				if(collegeName=="Sri Krishna Institute of Technology, Bengaluru"){
			String[] courses = {"BTech CSE, Mechanical, Civil, ECE"};
			return courses;
		}
				if(collegeName=="Presidency University, Bengaluru"){
			String[] courses = {"BTech, MBA, BBA, Law"};
			return courses;
		}
				if(collegeName=="M S Ramaiah University of Applied Sciences, Bengaluru"){
			String[] courses = {"BTech, MTech, MBA"};
			return courses;
		}
				if(collegeName=="NITTE University, Mangalur"){
			String[] courses = {"MBBS, BDS, BTech, MBA, Nursing"};
			return courses;
		}
				if(collegeName=="Shri Dharmasthala Manjunatheshwara University"){
			String[] courses = {"BTech, MBBS, BSc, MBA"};
			return courses;
		}
				if(collegeName=="JSS Science & Technology University, Mysuru"){
			String[] courses = {"CSE, ECE, Mechanical, Civil, AI & ML"};
			return courses;
		}
				if(collegeName=="Garden City University, Bengaluru"){
			String[] courses = {"CSE, ECE, Mechanical, Civil, AI & ML"};
			return courses;
		}
	  	       if(collegeName=="Bangalore University, Bengaluru"){
            String[] courses = {"BA, BSc, BCom, MA, MSc, MBA, Law"};
            return courses;
        }
			  if(collegeName=="University of Mysore, Mysuru"){
					String[] courses = {"BA, BSc, BCom, MA, MSc, MBA, Law"};
					return courses;
				}
			 if(collegeName=="Mangalore University, Mangaluru"){
					String[] courses = {"BA, BSc, BCom, MA, MSc, MBA"};
					return courses;
				}
			 if(collegeName=="Karnataka University, Dharwad"){
					String[] courses = {"BA, BSc, BCom, MA, MSc, MBA"};
					return courses;
				}
			 if(collegeName=="Gulbarga University, Kalaburagi"){
					String[] courses = {"BA, BSc, BCom, MA, MSc, MBA"};
					return courses;
				}
			 if(collegeName=="Kuvempu University, Shivamogga"){
					String[] courses = {"BA, BSc, BCom, MA, MSc, MBA"};
					return courses;
				}
			 if(collegeName=="Visvesvaraya Technological University, Belagavi"){
					String[] courses = {"BTech, MTech, MBA, MCA"};
					return courses;
				}
			 if(collegeName=="Rajiv Gandhi University of Health Sciences, Bengaluru"){
					String[] courses = {"MBBS, BDS, Nursing, Pharmacy, Allied Health"};
					return courses;
				}
			 if(collegeName=="Karnataka State Law University, Hubballi"){
					String[] courses = {"LLB, LLM, PhD Law"};
					return courses;
				}
			  if(collegeName=="University of Agricultural Sciences, Dharwad"){
					String[] courses = {"BSc Agriculture, MSc Agriculture, PhD Agriculture"};
					return courses;
				}
			  if(collegeName=="University of Horticultural Sciences, Bagalkot"){
					String[] courses = {"BSc Horticulture, MSc Horticulture, PhD Horticulture"};
					return courses;
				}
			  if(collegeName=="Karnataka Veterinary, Animal & Fisheries Sciences University, Bidar"){
					String[] courses = {"BVSc, BSc Fisheries, MSc, PhD"};
					return courses;
				}
			  if(collegeName=="Central University of Karnataka, Kalaburagi"){
					String[] courses = {"BA, BSc, BCom, MA, MSc, MBA"};
					return courses;
				}
			 if(collegeName=="Sri Devaraj Urs Academy of Higher Education & Research, Kolar"){
					String[] courses = {"MBBS, MD, MS, Nursing"};
					return courses;
				}
			  if(collegeName=="NIT Surathkal, Mangaluru"){
					String[] courses = {"BTech, MTech, MBA, MCA"};
					return courses;
				}
			 if(collegeName=="IIT Dharwad"){
					String[] courses = {"BTech, MTech, PhD Engineering"};
					return courses;
				}
			 if(collegeName=="IIM Bangalore"){
					String[] courses = {"MBA, Executive MBA, PhD Management"};
					return courses;
				}
			 if(collegeName=="NIMHANS, Bengaluru"){
					String[] courses = {"MBBS, MD Psychiatry, Neurosciences, Nursing"};
					return courses;
				}
			 if(collegeName=="Government Science College, Bengaluru"){
               String[] courses = {"BSc Physics, BSc Chemistry, BSc Mathematics, BA"};
               return courses;
}
			if(collegeName=="Government College of Engineering, Hassan"){
					String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
					return courses;
				}
			if(collegeName=="Government Law College, Bengaluru"){
					String[] courses = {"LLB, LLM"};
					return courses;
				}
			if(collegeName=="Government Medical College, Mysuru"){
					String[] courses = {"MBBS, MD, MS, Nursing"};
					return courses;
				}
			if(collegeName=="Government Dental College, Bengaluru"){
					String[] courses = {"BDS, MDS"};
					return courses;
				}
			if(collegeName=="Government College of Nursing, Bengaluru"){
					String[] courses = {"BSc Nursing, MSc Nursing"};
					return courses;
				}
			if(collegeName=="Government First Grade College, Mangaluru"){
					String[] courses = {"BA, BCom, BSc"};
					return courses;
				}
			if(collegeName=="Government First Grade College, Hubballi"){
					String[] courses = {"BA, BCom, BSc"};
					return courses;
				}
			if(collegeName=="Government First Grade College, Kalaburagi"){
					String[] courses = {"BA, BCom, BSc"};
					return courses;
				}
			if(collegeName=="Government First Grade College, Shivamogga"){
					String[] courses = {"BA, BCom, BSc"};
					return courses;
				}
			if(collegeName=="Government Engineering College, Raichur"){
					String[] courses = {"Civil, Mechanical, Computer Science"};
					return courses;
				}
			if(collegeName=="Government Engineering College, Bellary"){
					String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
					return courses;
				}
			if(collegeName=="Government Engineering College, Mandya"){
					String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
					return courses;
				}
			if(collegeName=="Government Polytechnic, Bengaluru"){
					String[] courses = {"Diploma in Mechanical, Electrical, Electronics"};
					return courses;
				}
			if(collegeName=="Government College of Pharmacy, Bengaluru"){
					String[] courses = {"BPharm, PharmD"};
					return courses;
				}
			if(collegeName=="Government Arts College, Bengaluru"){
					String[] courses = {"BA History, BA Economics, BA Political Science"};
					return courses;
				}
			if(collegeName=="Government Commerce College, Bengaluru"){
					String[] courses = {"BCom, MCom"};
					return courses;
				}
			if(collegeName=="Government College of Teacher Education, Belagavi"){
					String[] courses = {"BEd, MEd"};
					return courses;
				}
			if(collegeName=="RV College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Civil, AI & ML"};
				return courses;
			}
			if(collegeName=="BMS College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, Biotechnology"};
				return courses;
			}
			if(collegeName=="Acharya Institute of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, MBA"};
				return courses;
			}
			if(collegeName=="New Horizon College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, IT"};
				return courses;
			}
			if(collegeName=="Oxford College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, MBA"};
				return courses;
			}
			if(collegeName=="East Point College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Bangalore Institute of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, IT"};
				return courses;
			}
			if(collegeName=="Global Academy of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Sapthagiri College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Nagarjuna College of Engineering & Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Brindavan College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Don Bosco Institute of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="KLE Technological University, Hubballi"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, MBA"};
				return courses;
			}
			if(collegeName=="Basaveshwar Engineering College, Bagalkot"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="SDM College of Engineering, Dharwad"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Malnad College of Engineering, Hassan"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Ramanagara"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Chamarajanagar"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Kushalnagar"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Karwar"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Haveri"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Koppal"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Gadag"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Yadgir"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Chitradurga"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Kodagu"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Tumkur"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Davangere"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bijapur"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Kalaburagi"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bidar"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Raichur"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bellary"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Mandya"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Hassan"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Mysuru"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bengaluru Rural"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bengaluru Urban"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Shivamogga"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Udupi"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Mangaluru"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Belagavi"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Dharwad"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Hubballi"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bagalkot"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Gadag"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Chikkaballapur"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Kolar"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Mount Carmel College, Bengaluru"){
                String[] courses = {"BA, BSc, BCom, BBA, MSc"};
                return courses;
            }
			if(collegeName=="St. John’s Medical College, Bengaluru"){
				String[] courses = {"MBBS, MD, MS, Nursing, Allied Health"};
				return courses;
			}
			if(collegeName=="National Law School of India University, Bengaluru"){
				String[] courses = {"BA LLB, LLM, PhD Law"};
				return courses;
			}
			if(collegeName=="Bangalore Medical College and Research Institute, Bengaluru"){
				String[] courses = {"MBBS, MD, MS, Nursing"};
				return courses;
			}
			if(collegeName=="Kempegowda Institute of Medical Sciences, Bengaluru"){
				String[] courses = {"MBBS, MD, MS"};
				return courses;
			}
			if(collegeName=="Vydehi Institute of Medical Sciences, Bengaluru"){
				String[] courses = {"MBBS, MD, MS, Nursing, Dental"};
				return courses;
			}
			if(collegeName=="Kidwai Memorial Institute of Oncology, Bengaluru"){
				String[] courses = {"MD Oncology, Nursing"};
				return courses;
			}
			if(collegeName=="St. Philomena’s College, Mysuru"){
				String[] courses = {"BA, BSc, BCom, MA, MSc"};
				return courses;
			}
			if(collegeName=="Yuvaraja’s College, Mysuru"){
				String[] courses = {"BSc, MSc, BA"};
				return courses;
			}
			if(collegeName=="Maharani’s Science College for Women, Bengaluru"){
				String[] courses = {"BSc Physics, Chemistry, Mathematics"};
				return courses;
			}
			if(collegeName=="Maharani’s Arts, Commerce & Management College, Bengaluru"){
				String[] courses = {"BA, BCom, BBA"};
				return courses;
			}
			if(collegeName=="Kristu Jayanti College, Bengaluru"){
				String[] courses = {"BA, BCom, BBA, MBA, MSc"};
				return courses;
			}
			if(collegeName=="Jyoti Nivas College, Bengaluru"){
				String[] courses = {"BA, BCom, BBA, MBA"};
				return courses;
			}
			if(collegeName=="MES College of Arts, Commerce & Science, Bengaluru"){
				String[] courses = {"BA, BCom, BSc"};
				return courses;
			}
			if(collegeName=="National College, Basavanagudi, Bengaluru"){
				String[] courses = {"BA, BCom, BSc"};
				return courses;
			}
			if(collegeName=="Bishop Cotton Women’s Christian College, Bengaluru"){
				String[] courses = {"BA, BCom, BBA"};
				return courses;
			}
			if(collegeName=="St. Claret College, Bengaluru"){
				String[] courses = {"BA, BCom, BBA, MBA"};
				return courses;
			}
			if(collegeName=="Seshadripuram College, Bengaluru"){
				String[] courses = {"BA, BCom, BBA, MBA"};
				return courses;
			}
			if(collegeName=="Surana College, Bengaluru"){
				String[] courses = {"BA, BCom, BBA, MBA"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Chikkaballapur"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Kolar"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bengaluru Rural"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bengaluru Urban"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Shivamogga"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Udupi"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Mangaluru"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Belagavi"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Dharwad"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Hubballi"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bagalkot"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Gadag"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Kodagu"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Tumkur"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Davangere"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bijapur"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Kalaburagi"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bidar"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Polytechnic, Bengaluru"){
				String[] courses = {"Diploma in Mechanical, Civil, Electrical, Electronics"};
				return courses;
			}
			if(collegeName=="Government College of Pharmacy, Bengaluru"){
				String[] courses = {"BPharm, MPharm, PharmD"};
				return courses;
			}
			if(collegeName=="Government Arts College, Bengaluru"){
				String[] courses = {"BA History, BA Economics, BA Political Science"};
				return courses;
			}
			if(collegeName=="Government Commerce College, Bengaluru"){
				String[] courses = {"BCom, MCom"};
				return courses;
			}
			if(collegeName=="Government College of Teacher Education, Belagavi"){
				String[] courses = {"BEd, MEd"};
				return courses;
			}
			if(collegeName=="RV College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, AI & ML"};
				return courses;
			}
			if(collegeName=="BMS College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, Biotechnology"};
				return courses;
			}
			if(collegeName=="Acharya Institute of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, MBA"};
				return courses;
			}
			if(collegeName=="New Horizon College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, IT"};
				return courses;
			}
			if(collegeName=="Oxford College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, MBA"};
				return courses;
			}
			if(collegeName=="East Point College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Bangalore Institute of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, IT"};
				return courses;
			}
			if(collegeName=="Global Academy of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Sapthagiri College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Nagarjuna College of Engineering & Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Brindavan College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Don Bosco Institute of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="KLE Technological University, Hubballi"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, MBA"};
				return courses;
			}
			if(collegeName=="Basaveshwar Engineering College, Bagalkot"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="SDM College of Engineering, Dharwad"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Malnad College of Engineering, Hassan"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Mount Carmel College, Bengaluru"){
				String[] courses = {"BA, BSc, BCom, BBA, MSc"};
				return courses;
			}
			if(collegeName=="St. John’s Medical College, Bengaluru"){
				String[] courses = {"MBBS, MD, MS, Nursing, Allied Health"};
				return courses;
			}
			if(collegeName=="National Law School of India University, Bengaluru"){
				String[] courses = {"BA LLB, LLM, PhD Law"};
				return courses;
			}
			if(collegeName=="IIT Bombay, Maharashtra"){
				String[] courses = {"BTech, MTech, PhD Engineering, MSc"};
				return courses;
			}

			if(collegeName=="IIT Delhi, Delhi"){
				String[] courses = {"BTech, MTech, PhD Engineering"};
				return courses;
			}

			if(collegeName=="IIT Madras, Tamil Nadu"){
				String[] courses = {"BTech, MTech, MBA, PhD"};
				return courses;
			}

			if(collegeName=="IIT Kanpur, Uttar Pradesh"){
				String[] courses = {"BTech, MTech, MSc, PhD"};
				return courses;
			}

			if(collegeName=="IIT Kharagpur, West Bengal"){
				String[] courses = {"BTech, MTech, MBA, Law"};
				return courses;
			}

			if(collegeName=="IIM Ahmedabad, Gujarat"){
				String[] courses = {"MBA, Executive MBA, PhD Management"};
				return courses;
			}

			if(collegeName=="IIM Calcutta, West Bengal"){
				String[] courses = {"MBA, Executive MBA, PhD"};
				return courses;
			}

			if(collegeName=="IIM Lucknow, Uttar Pradesh"){
				String[] courses = {"MBA, Executive MBA, PhD"};
				return courses;
			}

			if(collegeName=="BITS Pilani, Rajasthan"){
				String[] courses = {"BTech, MTech, MBA, MSc"};
				return courses;
			}

			if(collegeName=="VIT Vellore, Tamil Nadu"){
				String[] courses = {"BTech, MTech, MBA, MCA"};
				return courses;
			}

			if(collegeName=="SRM Institute of Science and Technology, Tamil Nadu"){
				String[] courses = {"BTech, MBBS, MBA, Law"};
				return courses;
			}

			if(collegeName=="Manipal Academy of Higher Education, Karnataka"){
				String[] courses = {"MBBS, BTech, MBA, BBA"};
				return courses;
			}

			if(collegeName=="Ashoka University, Haryana"){
				String[] courses = {"BA Liberal Arts, BSc, MA"};
				return courses;
			}

			if(collegeName=="OP Jindal Global University, Haryana"){
				String[] courses = {"Law, MBA, International Relations"};
				return courses;
			}

			if(collegeName=="Jawaharlal Nehru University, Delhi"){
				String[] courses = {"MA, MSc, MPhil, PhD"};
				return courses;
			}

			if(collegeName=="Jamia Millia Islamia, Delhi"){
				String[] courses = {"BA, BTech, MBA, Law"};
				return courses;
			}

			if(collegeName=="Aligarh Muslim University, Uttar Pradesh"){
				String[] courses = {"MBBS, BTech, MBA, BA"};
				return courses;
			}

			if(collegeName=="University of Hyderabad, Telangana"){
				String[] courses = {"MA, MSc, MBA, PhD"};
				return courses;
			}

			if(collegeName=="Tata Institute of Social Sciences, Mumbai"){
				String[] courses = {"MA Social Work, Public Policy, PhD"};
				return courses;
			}

			if(collegeName=="Indian Statistical Institute, Kolkata"){
				String[] courses = {"BStat, MStat, PhD Statistics"};
				return courses;
			}
			if(collegeName=="Indian Institute of Science, Bengaluru"){
               String[] courses = {"BSc Research, MTech, PhD"};
               return courses;
             }

			if(collegeName=="Tumkur University, Tumkur"){
				String[] courses = {"BA, BSc, BCom, MA, MSc"};
				return courses;
			}

			if(collegeName=="Davangere University, Davangere"){
				String[] courses = {"BA, BSc, BCom, MBA"};
				return courses;
			}

			if(collegeName=="Karnataka Sanskrit University, Bengaluru"){
				String[] courses = {"BA Sanskrit, MA Sanskrit"};
				return courses;
			}

			if(collegeName=="Rani Channamma University, Belagavi"){
				String[] courses = {"BA, BSc, BCom, MA"};
				return courses;
			}

			if(collegeName=="Vijayanagara Sri Krishnadevaraya University, Ballari"){
				String[] courses = {"BA, BSc, BCom, MBA"};
				return courses;
			}

			if(collegeName=="Karnataka Janapada University, Haveri"){
				String[] courses = {"BA Folklore, MA Folklore"};
				return courses;
			}

			if(collegeName=="Bangalore Institute of Management Studies, Bengaluru"){
				String[] courses = {"BBA, MBA"};
				return courses;
			}

			if(collegeName=="Acharya Bangalore B-School, Bengaluru"){
				String[] courses = {"BBA, MBA"};
				return courses;
			}

			if(collegeName=="ISBR Business School, Bengaluru"){
				String[] courses = {"MBA, PGDM"};
				return courses;
			}

			if(collegeName=="CMR Institute of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}

			if(collegeName=="AMC Engineering College, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}

			if(collegeName=="BNM Institute of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical"};
				return courses;
			}

			if(collegeName=="Sir M Visvesvaraya Institute of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}

			if(collegeName=="Dayananda Sagar University, Bengaluru"){
				String[] courses = {"BTech, MBA, BBA"};
				return courses;
			}

			if(collegeName=="Krupanidhi Group of Institutions, Bengaluru"){
				String[] courses = {"BTech, MBA, Nursing"};
				return courses;
			}

			if(collegeName=="East West Institute of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical"};
				return courses;
			}

			if(collegeName=="MVJ College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}

			if(collegeName=="CMR Institute of Management Studies, Bengaluru"){
				String[] courses = {"BBA, MBA"};
				return courses;
			}

			if(collegeName=="Ramaiah College of Arts, Science and Commerce, Bengaluru"){
				String[] courses = {"BA, BSc, BCom"};
				return courses;
			}

		    if(collegeName=="Christ University, Bengaluru"){
			String[] courses = {"BA, BSc, BCom, BBA, BCA, MBA, Law"};
			return courses;
		    }
		    if(collegeName=="St. Josephs College of Commerce, Bengaluru"){
			String[] courses = {"BCom, BBA, MCom"};
			return courses;
		   }
		         if(collegeName=="Ramaiah Institute of Technology, Bengaluru"){
			String[] courses = {"CSE, ECE, Mechanical, Civil, AI & ML"};
		   	return courses;
		   }
		        if(collegeName=="Dayananda Sagar College of Engineering, Bengaluru"){
			String[] courses = {"CSE, IT, Mechanical, Civil, EEE, AI & ML"};
			return courses;
		  }
				if(collegeName=="RNS Institute of Technology, Bengaluru"){
			String[] courses = {"CSE, Civil, Mechanical, ECE, AI & Data Science"};
			return courses;
		  }
				if(collegeName=="Siddaganga Institute of Technology, Tumkur"){
			String[] courses = {"CSE, Civil, Mechanical, ECE"};
			return courses;
		  }
				if(collegeName=="Alliance University, Bengaluru"){
			String[] courses = {"BBA, MBA, BA, BSc, Law"};
			return courses;
		    }
				if(collegeName=="CMR University, Bengaluru"){
			String[] courses = {"BTech, MBA, BBA, BSc, Law"};
			return courses;
		}
				if(collegeName=="Reva University, Bengaluru"){
			String[] courses = {"BTech, MBA, BBA, BCom, BSc"};
			return courses;
		}
				if(collegeName=="PES University, Bengaluru"){
			String[] courses = {"BTech, MTech, MBA, MCA"};
			return courses;
		}
				if(collegeName=="Azim Premji University, Bengaluru"){
			String[] courses = {"BA, BEd, MA Education"};
			return courses;
		}
				if(collegeName=="Sri Krishna Institute of Technology, Bengaluru"){
			String[] courses = {"BTech CSE, Mechanical, Civil, ECE"};
			return courses;
		}
				if(collegeName=="Presidency University, Bengaluru"){
			String[] courses = {"BTech, MBA, BBA, Law"};
			return courses;
		}
				if(collegeName=="M S Ramaiah University of Applied Sciences, Bengaluru"){
			String[] courses = {"BTech, MTech, MBA"};
			return courses;
		}
				if(collegeName=="NITTE University, Mangalur"){
			String[] courses = {"MBBS, BDS, BTech, MBA, Nursing"};
			return courses;
		}
				if(collegeName=="Shri Dharmasthala Manjunatheshwara University"){
			String[] courses = {"BTech, MBBS, BSc, MBA"};
			return courses;
		}
				if(collegeName=="JSS Science & Technology University, Mysuru"){
			String[] courses = {"CSE, ECE, Mechanical, Civil, AI & ML"};
			return courses;
		}
				if(collegeName=="Garden City University, Bengaluru"){
			String[] courses = {"CSE, ECE, Mechanical, Civil, AI & ML"};
			return courses;
		}
	  	       if(collegeName=="Bangalore University, Bengaluru"){
            String[] courses = {"BA, BSc, BCom, MA, MSc, MBA, Law"};
            return courses;
        }
			  if(collegeName=="University of Mysore, Mysuru"){
					String[] courses = {"BA, BSc, BCom, MA, MSc, MBA, Law"};
					return courses;
				}
			 if(collegeName=="Mangalore University, Mangaluru"){
					String[] courses = {"BA, BSc, BCom, MA, MSc, MBA"};
					return courses;
				}
			 if(collegeName=="Karnataka University, Dharwad"){
					String[] courses = {"BA, BSc, BCom, MA, MSc, MBA"};
					return courses;
				}
			 if(collegeName=="Gulbarga University, Kalaburagi"){
					String[] courses = {"BA, BSc, BCom, MA, MSc, MBA"};
					return courses;
				}
			 if(collegeName=="Kuvempu University, Shivamogga"){
					String[] courses = {"BA, BSc, BCom, MA, MSc, MBA"};
					return courses;
				}
			 if(collegeName=="Visvesvaraya Technological University, Belagavi"){
					String[] courses = {"BTech, MTech, MBA, MCA"};
					return courses;
				}
			 if(collegeName=="Rajiv Gandhi University of Health Sciences, Bengaluru"){
					String[] courses = {"MBBS, BDS, Nursing, Pharmacy, Allied Health"};
					return courses;
				}
			 if(collegeName=="Karnataka State Law University, Hubballi"){
					String[] courses = {"LLB, LLM, PhD Law"};
					return courses;
				}
			  if(collegeName=="University of Agricultural Sciences, Dharwad"){
					String[] courses = {"BSc Agriculture, MSc Agriculture, PhD Agriculture"};
					return courses;
				}
			  if(collegeName=="University of Horticultural Sciences, Bagalkot"){
					String[] courses = {"BSc Horticulture, MSc Horticulture, PhD Horticulture"};
					return courses;
				}
			  if(collegeName=="Karnataka Veterinary, Animal & Fisheries Sciences University, Bidar"){
					String[] courses = {"BVSc, BSc Fisheries, MSc, PhD"};
					return courses;
				}
			  if(collegeName=="Central University of Karnataka, Kalaburagi"){
					String[] courses = {"BA, BSc, BCom, MA, MSc, MBA"};
					return courses;
				}
			 if(collegeName=="Sri Devaraj Urs Academy of Higher Education & Research, Kolar"){
					String[] courses = {"MBBS, MD, MS, Nursing"};
					return courses;
				}
			  if(collegeName=="NIT Surathkal, Mangaluru"){
					String[] courses = {"BTech, MTech, MBA, MCA"};
					return courses;
				}
			 if(collegeName=="IIT Dharwad"){
					String[] courses = {"BTech, MTech, PhD Engineering"};
					return courses;
				}
			 if(collegeName=="IIM Bangalore"){
					String[] courses = {"MBA, Executive MBA, PhD Management"};
					return courses;
				}
			 if(collegeName=="NIMHANS, Bengaluru"){
					String[] courses = {"MBBS, MD Psychiatry, Neurosciences, Nursing"};
					return courses;
				}
			 if(collegeName=="Government Science College, Bengaluru"){
               String[] courses = {"BSc Physics, BSc Chemistry, BSc Mathematics, BA"};
               return courses;
}
			if(collegeName=="Government College of Engineering, Hassan"){
					String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
					return courses;
				}
			if(collegeName=="Government Law College, Bengaluru"){
					String[] courses = {"LLB, LLM"};
					return courses;
				}
			if(collegeName=="Government Medical College, Mysuru"){
					String[] courses = {"MBBS, MD, MS, Nursing"};
					return courses;
				}
			if(collegeName=="Government Dental College, Bengaluru"){
					String[] courses = {"BDS, MDS"};
					return courses;
				}
			if(collegeName=="Government College of Nursing, Bengaluru"){
					String[] courses = {"BSc Nursing, MSc Nursing"};
					return courses;
				}
			if(collegeName=="Government First Grade College, Mangaluru"){
					String[] courses = {"BA, BCom, BSc"};
					return courses;
				}
			if(collegeName=="Government First Grade College, Hubballi"){
					String[] courses = {"BA, BCom, BSc"};
					return courses;
				}
			if(collegeName=="Government First Grade College, Kalaburagi"){
					String[] courses = {"BA, BCom, BSc"};
					return courses;
				}
			if(collegeName=="Government First Grade College, Shivamogga"){
					String[] courses = {"BA, BCom, BSc"};
					return courses;
				}
			if(collegeName=="Government Engineering College, Raichur"){
					String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
					return courses;
				}
			if(collegeName=="Government Engineering College, Bellary"){
					String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
					return courses;
				}
			if(collegeName=="Government Engineering College, Mandya"){
					String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
					return courses;
				}
			if(collegeName=="Government Polytechnic, Bengaluru"){
					String[] courses = {"Diploma in Mechanical, Civil, Electrical, Electronics"};
					return courses;
				}
			if(collegeName=="Government College of Pharmacy, Bengaluru"){
					String[] courses = {"BPharm, MPharm, PharmD"};
					return courses;
				}
			if(collegeName=="Government Arts College, Bengaluru"){
					String[] courses = {"BA History, BA Economics, BA Political Science"};
					return courses;
				}
			if(collegeName=="Government Commerce College, Bengaluru"){
					String[] courses = {"BCom, MCom"};
					return courses;
				}
			if(collegeName=="Government College of Teacher Education, Belagavi"){
					String[] courses = {"BEd, MEd"};
					return courses;
				}
			if(collegeName=="RV College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, AI & ML"};
				return courses;
			}
			if(collegeName=="BMS College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, Biotechnology"};
				return courses;
			}
			if(collegeName=="Acharya Institute of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, MBA"};
				return courses;
			}
			if(collegeName=="New Horizon College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, IT"};
				return courses;
			}
			if(collegeName=="Oxford College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, MBA"};
				return courses;
			}
			if(collegeName=="East Point College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Bangalore Institute of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, IT"};
				return courses;
			}
			if(collegeName=="Global Academy of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Sapthagiri College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Nagarjuna College of Engineering & Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Brindavan College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Don Bosco Institute of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="KLE Technological University, Hubballi"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, MBA"};
				return courses;
			}
			if(collegeName=="Basaveshwar Engineering College, Bagalkot"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="SDM College of Engineering, Dharwad"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Malnad College of Engineering, Hassan"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Ramanagara"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Chamarajanagar"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Kushalnagar"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Karwar"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Haveri"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Koppal"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Gadag"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Yadgir"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Chitradurga"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Kodagu"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Tumkur"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Davangere"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bijapur"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Kalaburagi"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bidar"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Raichur"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bellary"){
				String[] courses = {"Civil, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Mandya"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Hassan"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Mysuru"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bengaluru Rural"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bengaluru Urban"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Shivamogga"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Udupi"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Mangaluru"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Belagavi"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Dharwad"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Hubballi"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bagalkot"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Gadag"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Chikkaballapur"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Kolar"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Mount Carmel College, Bengaluru"){
                String[] courses = {"BA, BSc, BCom, BBA, MSc"};
                return courses;
            }
			if(collegeName=="St. John’s Medical College, Bengaluru"){
				String[] courses = {"MBBS, MD, MS, Nursing, Allied Health"};
				return courses;
			}
			if(collegeName=="National Law School of India University, Bengaluru"){
				String[] courses = {"BA LLB, LLM, PhD Law"};
				return courses;
			}
			if(collegeName=="Bangalore Medical College and Research Institute, Bengaluru"){
				String[] courses = {"MBBS, MD, MS, Nursing"};
				return courses;
			}
			if(collegeName=="Kempegowda Institute of Medical Sciences, Bengaluru"){
				String[] courses = {"MBBS, MD, MS"};
				return courses;
			}
			if(collegeName=="Vydehi Institute of Medical Sciences, Bengaluru"){
				String[] courses = {"MBBS, MD, MS, Nursing, Dental"};
				return courses;
			}
			if(collegeName=="Kidwai Memorial Institute of Oncology, Bengaluru"){
				String[] courses = {"MD Oncology, Nursing"};
				return courses;
			}
			if(collegeName=="St. Philomena’s College, Mysuru"){
				String[] courses = {"BA, BSc, BCom, MA, MSc"};
				return courses;
			}
			if(collegeName=="Yuvaraja’s College, Mysuru"){
				String[] courses = {"BSc, MSc, BA"};
				return courses;
			}
			if(collegeName=="Maharani’s Science College for Women, Bengaluru"){
				String[] courses = {"BSc Physics, Chemistry, Mathematics"};
				return courses;
			}
			if(collegeName=="Maharani’s Arts, Commerce & Management College, Bengaluru"){
				String[] courses = {"BA, BCom, BBA"};
				return courses;
			}
			if(collegeName=="Kristu Jayanti College, Bengaluru"){
				String[] courses = {"BA, BCom, BBA, MBA, MSc"};
				return courses;
			}
			if(collegeName=="Jyoti Nivas College, Bengaluru"){
				String[] courses = {"BA, BCom, BBA, MBA"};
				return courses;
			}
			if(collegeName=="MES College of Arts, Commerce & Science, Bengaluru"){
				String[] courses = {"BA, BCom, BSc"};
				return courses;
			}
			if(collegeName=="National College, Basavanagudi, Bengaluru"){
				String[] courses = {"BA, BCom, BSc"};
				return courses;
			}
			if(collegeName=="Bishop Cotton Women’s Christian College, Bengaluru"){
				String[] courses = {"BA, BCom, BBA"};
				return courses;
			}
			if(collegeName=="St. Claret College, Bengaluru"){
				String[] courses = {"BA, BCom, BBA, MBA"};
				return courses;
			}
			if(collegeName=="Seshadripuram College, Bengaluru"){
				String[] courses = {"BA, BCom, BBA, MBA"};
				return courses;
			}
			if(collegeName=="Surana College, Bengaluru"){
				String[] courses = {"BA, BCom, BBA, MBA"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Chikkaballapur"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Kolar"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bengaluru Rural"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bengaluru Urban"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Shivamogga"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Udupi"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Mangaluru"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Belagavi"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Dharwad"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Hubballi"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bagalkot"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Gadag"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Kodagu"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Tumkur"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Davangere"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bijapur"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Kalaburagi"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Engineering College, Bidar"){
				String[] courses = {"Civil, Mechanical, Electrical, Computer Science"};
				return courses;
			}
			if(collegeName=="Government Polytechnic, Bengaluru"){
				String[] courses = {"Diploma in Mechanical, Civil, Electrical, Electronics"};
				return courses;
			}
			if(collegeName=="Government College of Pharmacy, Bengaluru"){
				String[] courses = {"BPharm, MPharm, PharmD"};
				return courses;
			}
			if(collegeName=="Government Arts College, Bengaluru"){
				String[] courses = {"BA History, BA Economics, BA Political Science"};
				return courses;
			}
			if(collegeName=="Government Commerce College, Bengaluru"){
				String[] courses = {"BCom, MCom"};
				return courses;
			}
			if(collegeName=="Government College of Teacher Education, Belagavi"){
				String[] courses = {"BEd, MEd"};
				return courses;
			}
			if(collegeName=="RV College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, AI & ML"};
				return courses;
			}
			if(collegeName=="BMS College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, Biotechnology"};
				return courses;
			}
			if(collegeName=="Acharya Institute of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, MBA"};
				return courses;
			}
			if(collegeName=="New Horizon College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, IT"};
				return courses;
			}
			if(collegeName=="Oxford College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, MBA"};
				return courses;
			}
			if(collegeName=="East Point College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Bangalore Institute of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, IT"};
				return courses;
			}
			if(collegeName=="Global Academy of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Sapthagiri College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Nagarjuna College of Engineering & Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Brindavan College of Engineering, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Don Bosco Institute of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="KLE Technological University, Hubballi"){
				String[] courses = {"CSE, ECE, Mechanical, Civil, MBA"};
				return courses;
			}
			if(collegeName=="Basaveshwar Engineering College, Bagalkot"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="SDM College of Engineering, Dharwad"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Malnad College of Engineering, Hassan"){
				String[] courses = {"CSE, ECE, Mechanical, Civil"};
				return courses;
			}
			if(collegeName=="Mount Carmel College, Bengaluru"){
				String[] courses = {"BA, BSc, BCom, BBA, MSc"};
				return courses;
			}
			if(collegeName=="St. John’s Medical College, Bengaluru"){
				String[] courses = {"MBBS, MD, MS, Nursing, Allied Health"};
				return courses;
			}
			if(collegeName=="National Law School of India University, Bengaluru"){
				String[] courses = {"BA LLB, LLM, PhD Law"};
				return courses;
			}
			if(collegeName=="IIT Bombay, Maharashtra"){
				String[] courses = {"BTech, MTech, PhD Engineering, MSc"};
				return courses;
			}

			if(collegeName=="IIT Delhi, Delhi"){
				String[] courses = {"BTech, MTech, PhD Engineering"};
				return courses;
			}

			if(collegeName=="IIT Madras, Tamil Nadu"){
				String[] courses = {"BTech, MTech, MBA, PhD"};
				return courses;
			}

			if(collegeName=="IIT Kanpur, Uttar Pradesh"){
				String[] courses = {"BTech, MTech, MSc, PhD"};
				return courses;
			}

			if(collegeName=="IIT Kharagpur, West Bengal"){
				String[] courses = {"BTech, MTech, MBA, Law"};
				return courses;
			}

			if(collegeName=="IIM Ahmedabad, Gujarat"){
				String[] courses = {"MBA, Executive MBA, PhD Management"};
				return courses;
			}

			if(collegeName=="IIM Calcutta, West Bengal"){
				String[] courses = {"MBA, Executive MBA, PhD"};
				return courses;
			}

			if(collegeName=="IIM Lucknow, Uttar Pradesh"){
				String[] courses = {"MBA, Executive MBA, PhD"};
				return courses;
			}

			if(collegeName=="BITS Pilani, Rajasthan"){
				String[] courses = {"BTech, MTech, MBA, MSc"};
				return courses;
			}

			if(collegeName=="VIT Vellore, Tamil Nadu"){
				String[] courses = {"BTech, MTech, MBA, MCA"};
				return courses;
			}

			if(collegeName=="SRM Institute of Science and Technology, Tamil Nadu"){
				String[] courses = {"BTech, MBBS, MBA, Law"};
				return courses;
			}

			if(collegeName=="Manipal Academy of Higher Education, Karnataka"){
				String[] courses = {"MBBS, BTech, MBA, BBA"};
				return courses;
			}

			if(collegeName=="Ashoka University, Haryana"){
				String[] courses = {"BA Liberal Arts, BSc, MA"};
				return courses;
			}

			if(collegeName=="OP Jindal Global University, Haryana"){
				String[] courses = {"Law, MBA, International Relations"};
				return courses;
			}

			if(collegeName=="Jawaharlal Nehru University, Delhi"){
				String[] courses = {"MA, MSc, MPhil, PhD"};
				return courses;
			}

			if(collegeName=="Jamia Millia Islamia, Delhi"){
				String[] courses = {"BA, BTech, Law"};
				return courses;
			}

			if(collegeName=="Aligarh Muslim University, Uttar Pradesh"){
				String[] courses = {"MBBS, MBA, BA"};
				return courses;
			}

			if(collegeName=="University of Hyderabad, Telangana"){
				String[] courses = {"MA, MSc, MBA, PhD"};
				return courses;
			}

			if(collegeName=="Tata Institute of Social Sciences, Mumbai"){
				String[] courses = {"MA Social Work, Public Policy, PhD"};
				return courses;
			}

			if(collegeName=="Indian Statistical Institute, Kolkata"){
				String[] courses = {"BStat, MStat, PhD Statistics"};
				return courses;
			}
			if(collegeName=="Indian Institute of Science, Bengaluru"){
               String[] courses = {"BSc Research, PhD"};
               return courses;
             }

			if(collegeName=="Tumkur University, Tumkur"){
				String[] courses = {"BA, BCom, MA, MSc"};
				return courses;
			}

			if(collegeName=="Davangere University, Davangere"){
				String[] courses = {"BA, BCom, MBA"};
				return courses;
			}

			if(collegeName=="Karnataka Sanskrit University, Bengaluru"){
				String[] courses = {"BA Sanskrit,BE, MA Sanskrit"};
				return courses;
			}

			if(collegeName=="Rani Channamma University, Belagavi"){
				String[] courses = {"BA, BSc, MA"};
				return courses;
			}

			if(collegeName=="Vijayanagara Sri Krishnadevaraya University, Ballari"){
				String[] courses = {"BA, BSc, MBA"};
				return courses;
			}

			if(collegeName=="Karnataka Janapada University, Haveri"){
				String[] courses = {"BA Folklore,BE, MA Folklore"};
				return courses;
			}

			if(collegeName=="Bangalore Institute of Management Studies, Bengaluru"){
				String[] courses = {"BBA,DrPG, MBA"};
				return courses;
			}

			if(collegeName=="Acharya Bangalore B-School, Bengaluru"){
				String[] courses = {"BBA,PG, MBA"};
				return courses;
			}

			if(collegeName=="ISBR Business School, Bengaluru"){
				String[] courses = {"MBA,BBM, PGDM"};
				return courses;
			}

			if(collegeName=="CMR Institute of Technology, Bengaluru"){
				String[] courses = {"CSE, ECE, Civil"};
				return courses;
			}  
           System.out.println("The colleges are not in the list." + collegeName);
           return null;
	}
}

          