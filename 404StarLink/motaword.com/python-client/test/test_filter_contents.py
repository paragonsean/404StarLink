# coding: utf-8

"""
    MotaWord API

    Use MotaWord API to post and track your translation projects.

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.filter_contents import FilterContents

class TestFilterContents(unittest.TestCase):
    """FilterContents unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> FilterContents:
        """Test FilterContents
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `FilterContents`
        """
        model = FilterContents()
        if include_optional:
            return FilterContents(
                budget_codes = [
                    ''
                    ],
                categories = [
                    ''
                    ],
                clients = [
                    openapi_client.models.simple_model.SimpleModel(
                        id = 56, 
                        name = '', )
                    ],
                documents = [
                    openapi_client.models.simple_model.SimpleModel(
                        id = 56, 
                        name = '', )
                    ],
                projects = [
                    openapi_client.models.simple_model.SimpleModel(
                        id = 56, 
                        name = '', )
                    ],
                severities = [
                    ''
                    ],
                source_languages = [
                    ''
                    ],
                subjects = [
                    ''
                    ],
                target_languages = [
                    ''
                    ],
                vendors = [
                    openapi_client.models.simple_model.SimpleModel(
                        id = 56, 
                        name = '', )
                    ]
            )
        else:
            return FilterContents(
        )
        """

    def testFilterContents(self):
        """Test FilterContents"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
