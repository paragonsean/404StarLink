# coding: utf-8

"""
    Punjab State eGovernance Society, Punjab

    eDistrict Punjab (http://edistrict.punjabgovt.gov.in) is the online service delivery portal for Punjab State Govt. Certain documents issued by it (e.g. Residence, SC/ST, OBC Certificates etc) can be pulled into citizens' DigiLocker accounts.

    The version of the OpenAPI document: 3.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.academic_certificate_schema_issued_by_organization_address import AcademicCertificateSchemaIssuedByOrganizationAddress

class TestAcademicCertificateSchemaIssuedByOrganizationAddress(unittest.TestCase):
    """AcademicCertificateSchemaIssuedByOrganizationAddress unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AcademicCertificateSchemaIssuedByOrganizationAddress:
        """Test AcademicCertificateSchemaIssuedByOrganizationAddress
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AcademicCertificateSchemaIssuedByOrganizationAddress`
        """
        model = AcademicCertificateSchemaIssuedByOrganizationAddress()
        if include_optional:
            return AcademicCertificateSchemaIssuedByOrganizationAddress(
                country = 'IN',
                district = '',
                house = '',
                landmark = '',
                line1 = '',
                line2 = '',
                locality = '',
                pin = '',
                state = '',
                type = '',
                vtc = ''
            )
        else:
            return AcademicCertificateSchemaIssuedByOrganizationAddress(
                country = 'IN',
                district = '',
                house = '',
                landmark = '',
                line1 = '',
                line2 = '',
                locality = '',
                pin = '',
                state = '',
                type = '',
                vtc = '',
        )
        """

    def testAcademicCertificateSchemaIssuedByOrganizationAddress(self):
        """Test AcademicCertificateSchemaIssuedByOrganizationAddress"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
