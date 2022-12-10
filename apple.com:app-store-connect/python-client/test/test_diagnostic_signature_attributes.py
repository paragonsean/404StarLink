# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.diagnostic_signature_attributes import DiagnosticSignatureAttributes

class TestDiagnosticSignatureAttributes(unittest.TestCase):
    """DiagnosticSignatureAttributes unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DiagnosticSignatureAttributes:
        """Test DiagnosticSignatureAttributes
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DiagnosticSignatureAttributes`
        """
        model = DiagnosticSignatureAttributes()
        if include_optional:
            return DiagnosticSignatureAttributes(
                diagnostic_type = 'DISK_WRITES',
                signature = '',
                weight = 1.337
            )
        else:
            return DiagnosticSignatureAttributes(
        )
        """

    def testDiagnosticSignatureAttributes(self):
        """Test DiagnosticSignatureAttributes"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
