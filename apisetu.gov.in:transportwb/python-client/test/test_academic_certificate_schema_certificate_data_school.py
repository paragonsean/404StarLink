# coding: utf-8

"""
    Transport Department, West Bengal

    Driving License (DL) and Vehicle Registration Certificate (RC) of the State, as available on Parivahan Sewa (http://parivahan.co.in/) of Ministry of Road Transport and Highways, are available on DigiLocker. Citizens can pull these documents into their DigiLocker accounts.

    The version of the OpenAPI document: 3.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.academic_certificate_schema_certificate_data_school import AcademicCertificateSchemaCertificateDataSchool

class TestAcademicCertificateSchemaCertificateDataSchool(unittest.TestCase):
    """AcademicCertificateSchemaCertificateDataSchool unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AcademicCertificateSchemaCertificateDataSchool:
        """Test AcademicCertificateSchemaCertificateDataSchool
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AcademicCertificateSchemaCertificateDataSchool`
        """
        model = AcademicCertificateSchemaCertificateDataSchool()
        if include_optional:
            return AcademicCertificateSchemaCertificateDataSchool(
                code = '20020',
                name = 'DELHI PUBLIC SCHOOL GURGAON'
            )
        else:
            return AcademicCertificateSchemaCertificateDataSchool(
                code = '20020',
                name = 'DELHI PUBLIC SCHOOL GURGAON',
        )
        """

    def testAcademicCertificateSchemaCertificateDataSchool(self):
        """Test AcademicCertificateSchemaCertificateDataSchool"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
