# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.diagnostic_log import DiagnosticLog

class TestDiagnosticLog(unittest.TestCase):
    """DiagnosticLog unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DiagnosticLog:
        """Test DiagnosticLog
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DiagnosticLog`
        """
        model = DiagnosticLog()
        if include_optional:
            return DiagnosticLog(
                id = '',
                links = openapi_client.models.resource_links.ResourceLinks(
                    self = '', ),
                type = 'diagnosticLogs'
            )
        else:
            return DiagnosticLog(
                id = '',
                links = openapi_client.models.resource_links.ResourceLinks(
                    self = '', ),
                type = 'diagnosticLogs',
        )
        """

    def testDiagnosticLog(self):
        """Test DiagnosticLog"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
