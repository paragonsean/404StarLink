# coding: utf-8

"""
    MotaWord API

    Use MotaWord API to post and track your translation projects.

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.language_pairs_report_report_inner_language_pair import LanguagePairsReportReportInnerLanguagePair

class TestLanguagePairsReportReportInnerLanguagePair(unittest.TestCase):
    """LanguagePairsReportReportInnerLanguagePair unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> LanguagePairsReportReportInnerLanguagePair:
        """Test LanguagePairsReportReportInnerLanguagePair
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `LanguagePairsReportReportInnerLanguagePair`
        """
        model = LanguagePairsReportReportInnerLanguagePair()
        if include_optional:
            return LanguagePairsReportReportInnerLanguagePair(
                source_language = '',
                target_language = ''
            )
        else:
            return LanguagePairsReportReportInnerLanguagePair(
        )
        """

    def testLanguagePairsReportReportInnerLanguagePair(self):
        """Test LanguagePairsReportReportInnerLanguagePair"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
