# coding: utf-8

"""
    Punjab State eGovernance Society, Punjab

    eDistrict Punjab (http://edistrict.punjabgovt.gov.in) is the online service delivery portal for Punjab State Govt. Certain documents issued by it (e.g. Residence, SC/ST, OBC Certificates etc) can be pulled into citizens' DigiLocker accounts.

    The version of the OpenAPI document: 3.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.academic_certificate_schema_issued_to_person import AcademicCertificateSchemaIssuedToPerson

class TestAcademicCertificateSchemaIssuedToPerson(unittest.TestCase):
    """AcademicCertificateSchemaIssuedToPerson unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AcademicCertificateSchemaIssuedToPerson:
        """Test AcademicCertificateSchemaIssuedToPerson
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AcademicCertificateSchemaIssuedToPerson`
        """
        model = AcademicCertificateSchemaIssuedToPerson()
        if include_optional:
            return AcademicCertificateSchemaIssuedToPerson(
                address = openapi_client.models.academic_certificate_schema_issued_to_person_address.AcademicCertificateSchema_IssuedTo_Person_Address(
                    country = 'IN', 
                    district = '', 
                    house = '', 
                    landmark = '', 
                    line1 = '', 
                    line2 = '', 
                    locality = '', 
                    pin = '', 
                    state = '', 
                    type = 'permanent', 
                    vtc = '', ),
                photo = openapi_client.models.academic_certificate_schema_issued_to_person_photo.AcademicCertificateSchema_IssuedTo_Person_Photo(
                    format = '', ),
                category = 'SC',
                disability_status = '',
                dob = '01-10-1988',
                email = '',
                gender = '',
                marital_status = '',
                mother_name = 'SUNITA DEVI',
                name = 'ANAND KUMAR',
                phone = '',
                religion = '',
                swd = 'PRAMOD KUMAR',
                swd_indicator = 'S',
                title = '',
                uid = ''
            )
        else:
            return AcademicCertificateSchemaIssuedToPerson(
                address = openapi_client.models.academic_certificate_schema_issued_to_person_address.AcademicCertificateSchema_IssuedTo_Person_Address(
                    country = 'IN', 
                    district = '', 
                    house = '', 
                    landmark = '', 
                    line1 = '', 
                    line2 = '', 
                    locality = '', 
                    pin = '', 
                    state = '', 
                    type = 'permanent', 
                    vtc = '', ),
                photo = openapi_client.models.academic_certificate_schema_issued_to_person_photo.AcademicCertificateSchema_IssuedTo_Person_Photo(
                    format = '', ),
                category = 'SC',
                disability_status = '',
                dob = '01-10-1988',
                email = '',
                gender = '',
                marital_status = '',
                mother_name = 'SUNITA DEVI',
                name = 'ANAND KUMAR',
                phone = '',
                religion = '',
                swd = 'PRAMOD KUMAR',
                swd_indicator = 'S',
                title = '',
                uid = '',
        )
        """

    def testAcademicCertificateSchemaIssuedToPerson(self):
        """Test AcademicCertificateSchemaIssuedToPerson"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
