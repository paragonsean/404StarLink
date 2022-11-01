# coding: utf-8

"""
    GitHub v3 REST API

    GitHub's v3 REST API.

    The version of the OpenAPI document: 1.1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.code_of_conduct_simple import CodeOfConductSimple

class TestCodeOfConductSimple(unittest.TestCase):
    """CodeOfConductSimple unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CodeOfConductSimple:
        """Test CodeOfConductSimple
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CodeOfConductSimple`
        """
        model = CodeOfConductSimple()
        if include_optional:
            return CodeOfConductSimple(
                html_url = 'https://github.com/github/docs/blob/main/CODE_OF_CONDUCT.md',
                key = 'citizen_code_of_conduct',
                name = 'Citizen Code of Conduct',
                url = 'https://api.github.com/repos/github/docs/community/code_of_conduct'
            )
        else:
            return CodeOfConductSimple(
                html_url = 'https://github.com/github/docs/blob/main/CODE_OF_CONDUCT.md',
                key = 'citizen_code_of_conduct',
                name = 'Citizen Code of Conduct',
                url = 'https://api.github.com/repos/github/docs/community/code_of_conduct',
        )
        """

    def testCodeOfConductSimple(self):
        """Test CodeOfConductSimple"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
