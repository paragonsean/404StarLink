# coding: utf-8

"""
    Discovery API

    The Ticketmaster Discovery API allows you to search for events, attractions, or venues.

    The version of the OpenAPI document: v2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.classification import Classification

class TestClassification(unittest.TestCase):
    """Classification unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Classification:
        """Test Classification
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Classification`
        """
        model = Classification()
        if include_optional:
            return Classification(
                genre = openapi_client.models.level.Level(
                    id = '', 
                    name = '', ),
                primary = True,
                segment = openapi_client.models.segment.Segment(
                    id = '', 
                    name = '', ),
                sub_genre = openapi_client.models.level.Level(
                    id = '', 
                    name = '', ),
                sub_type = openapi_client.models.level.Level(
                    id = '', 
                    name = '', ),
                type = openapi_client.models.level.Level(
                    id = '', 
                    name = '', )
            )
        else:
            return Classification(
        )
        """

    def testClassification(self):
        """Test Classification"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
