# coding: utf-8

"""
    Messages API

    The Messages API consolidates and normalises exchanges across all messaging channels. It allows you to use a single API to interact with our various channels such as SMS, MMS, WhatsApp, Viber and Facebook Messenger

    The version of the OpenAPI document: 1.4.0
    Contact: devrel@nexmo.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.location import Location

class TestLocation(unittest.TestCase):
    """Location unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Location:
        """Test Location
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Location`
        """
        model = Location()
        if include_optional:
            return Location(
                client_ref = '',
                location = openapi_client.models.location_1_location.Location_1_location(
                    address = '23 Main St, Holmdel, NJ 07733, USA', 
                    lat = 40.34772, 
                    long = -74.18847, 
                    name = 'Vonage', ),
                message_type = 'location'
            )
        else:
            return Location(
                location = openapi_client.models.location_1_location.Location_1_location(
                    address = '23 Main St, Holmdel, NJ 07733, USA', 
                    lat = 40.34772, 
                    long = -74.18847, 
                    name = 'Vonage', ),
                message_type = 'location',
        )
        """

    def testLocation(self):
        """Test Location"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
