# coding: utf-8

"""
    MotaWord API

    Use MotaWord API to post and track your translation projects.

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.token_error import TokenError

class TestTokenError(unittest.TestCase):
    """TokenError unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> TokenError:
        """Test TokenError
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `TokenError`
        """
        model = TokenError()
        if include_optional:
            return TokenError(
                code = '',
                help = '',
                http_code = 56,
                message = '',
                account_status = 'registered'
            )
        else:
            return TokenError(
        )
        """

    def testTokenError(self):
        """Test TokenError"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
