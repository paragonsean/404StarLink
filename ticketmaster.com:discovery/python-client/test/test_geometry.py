# coding: utf-8

"""
    Discovery API

    The Ticketmaster Discovery API allows you to search for events, attractions, or venues.

    The version of the OpenAPI document: v2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.geometry import Geometry

class TestGeometry(unittest.TestCase):
    """Geometry unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Geometry:
        """Test Geometry
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Geometry`
        """
        model = Geometry()
        if include_optional:
            return Geometry(
                location = openapi_client.models.location.Location(
                    latitude = 1.337, 
                    longitude = 1.337, )
            )
        else:
            return Geometry(
        )
        """

    def testGeometry(self):
        """Test Geometry"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
