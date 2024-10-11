# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.projects_move_card503_response import ProjectsMoveCard503Response

class TestProjectsMoveCard503Response(unittest.TestCase):
    """ProjectsMoveCard503Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ProjectsMoveCard503Response:
        """Test ProjectsMoveCard503Response
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ProjectsMoveCard503Response`
        """
        model = ProjectsMoveCard503Response()
        if include_optional:
            return ProjectsMoveCard503Response(
                code = '',
                documentation_url = '',
                errors = [
                    openapi_client.models.projects_move_card_503_response_errors_inner.projects_move_card_503_response_errors_inner(
                        code = '', 
                        message = '', )
                    ],
                message = ''
            )
        else:
            return ProjectsMoveCard503Response(
        )
        """

    def testProjectsMoveCard503Response(self):
        """Test ProjectsMoveCard503Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
