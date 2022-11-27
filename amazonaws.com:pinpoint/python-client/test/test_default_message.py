# coding: utf-8

"""
    Amazon Pinpoint

    Doc Engage API - Amazon Pinpoint API

    The version of the OpenAPI document: 2016-12-01
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.default_message import DefaultMessage

class TestDefaultMessage(unittest.TestCase):
    """DefaultMessage unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DefaultMessage:
        """Test DefaultMessage
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DefaultMessage`
        """
        model = DefaultMessage()
        if include_optional:
            return DefaultMessage(
                body = None,
                substitutions = None
            )
        else:
            return DefaultMessage(
        )
        """

    def testDefaultMessage(self):
        """Test DefaultMessage"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
