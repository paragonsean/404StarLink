# coding: utf-8

"""
    Meghalaya Board of School Education, Tura, Meghalaya

    Meghalaya Board of School Education (MBOSE) with Marksheets of Class Xth and Class XIIth (Arts , Science, Commerce and Vocational), is availablke on DigiLocker for the students of 2015-2019.

    The version of the OpenAPI document: 3.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.academic_certificate_schema_certificate_data_performance_subjects_inner import AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner

class TestAcademicCertificateSchemaCertificateDataPerformanceSubjectsInner(unittest.TestCase):
    """AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner:
        """Test AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner`
        """
        model = AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner()
        if include_optional:
            return AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner(
                code = '30',
                gp = '',
                gp_max = '',
                grade = 'A2',
                marks_max = 56,
                marks_max_practical = 56,
                marks_max_theory = 56,
                marks_practical = 17,
                marks_theory = 70,
                marks_total = 87,
                name = 'ECONOMICS'
            )
        else:
            return AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner(
                code = '30',
                gp = '',
                gp_max = '',
                grade = 'A2',
                marks_max = 56,
                marks_max_practical = 56,
                marks_max_theory = 56,
                marks_practical = 17,
                marks_theory = 70,
                marks_total = 87,
                name = 'ECONOMICS',
        )
        """

    def testAcademicCertificateSchemaCertificateDataPerformanceSubjectsInner(self):
        """Test AcademicCertificateSchemaCertificateDataPerformanceSubjectsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
