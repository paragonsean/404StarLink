# coding: utf-8

"""
    Mailscript

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 0.4.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.send_request import SendRequest

class TestSendRequest(unittest.TestCase):
    """SendRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SendRequest:
        """Test SendRequest
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SendRequest`
        """
        model = SendRequest()
        if include_optional:
            return SendRequest(
                var_from = '',
                html = '',
                subject = '',
                text = '',
                to = ''
            )
        else:
            return SendRequest(
                var_from = '',
                subject = '',
                to = '',
        )
        """

    def testSendRequest(self):
        """Test SendRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
