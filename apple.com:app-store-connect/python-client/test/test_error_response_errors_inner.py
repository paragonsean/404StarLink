# coding: utf-8

"""
    App Store Connect API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.4.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.error_response_errors_inner import ErrorResponseErrorsInner

class TestErrorResponseErrorsInner(unittest.TestCase):
    """ErrorResponseErrorsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ErrorResponseErrorsInner:
        """Test ErrorResponseErrorsInner
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ErrorResponseErrorsInner`
        """
        model = ErrorResponseErrorsInner()
        if include_optional:
            return ErrorResponseErrorsInner(
                code = '',
                detail = '',
                id = '',
                source = None,
                status = '',
                title = ''
            )
        else:
            return ErrorResponseErrorsInner(
                code = '',
                detail = '',
                status = '',
                title = '',
        )
        """

    def testErrorResponseErrorsInner(self):
        """Test ErrorResponseErrorsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
