# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.checks_create_request_one_of1 import ChecksCreateRequestOneOf1

class TestChecksCreateRequestOneOf1(unittest.TestCase):
    """ChecksCreateRequestOneOf1 unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ChecksCreateRequestOneOf1:
        """Test ChecksCreateRequestOneOf1
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ChecksCreateRequestOneOf1`
        """
        model = ChecksCreateRequestOneOf1()
        if include_optional:
            return ChecksCreateRequestOneOf1(
                status = 'queued'
            )
        else:
            return ChecksCreateRequestOneOf1(
        )
        """

    def testChecksCreateRequestOneOf1(self):
        """Test ChecksCreateRequestOneOf1"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
