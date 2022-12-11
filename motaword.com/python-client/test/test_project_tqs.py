# coding: utf-8

"""
    MotaWord API

    Use MotaWord API to post and track your translation projects.

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.project_tqs import ProjectTQS

class TestProjectTQS(unittest.TestCase):
    """ProjectTQS unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ProjectTQS:
        """Test ProjectTQS
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ProjectTQS`
        """
        model = ProjectTQS()
        if include_optional:
            return ProjectTQS(
                is_above_average = True,
                score = 1.337,
                strings_edited = 56,
                strings_translated = 56
            )
        else:
            return ProjectTQS(
        )
        """

    def testProjectTQS(self):
        """Test ProjectTQS"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
