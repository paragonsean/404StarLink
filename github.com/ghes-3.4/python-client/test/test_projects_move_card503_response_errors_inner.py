# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.projects_move_card503_response_errors_inner import ProjectsMoveCard503ResponseErrorsInner

class TestProjectsMoveCard503ResponseErrorsInner(unittest.TestCase):
    """ProjectsMoveCard503ResponseErrorsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ProjectsMoveCard503ResponseErrorsInner:
        """Test ProjectsMoveCard503ResponseErrorsInner
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ProjectsMoveCard503ResponseErrorsInner`
        """
        model = ProjectsMoveCard503ResponseErrorsInner()
        if include_optional:
            return ProjectsMoveCard503ResponseErrorsInner(
                code = '',
                message = ''
            )
        else:
            return ProjectsMoveCard503ResponseErrorsInner(
        )
        """

    def testProjectsMoveCard503ResponseErrorsInner(self):
        """Test ProjectsMoveCard503ResponseErrorsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
