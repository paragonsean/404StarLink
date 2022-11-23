# coding: utf-8

"""
    SiriKit Cloud Media

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.play_media_intent_response import PlayMediaIntentResponse

class TestPlayMediaIntentResponse(unittest.TestCase):
    """PlayMediaIntentResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PlayMediaIntentResponse:
        """Test PlayMediaIntentResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PlayMediaIntentResponse`
        """
        model = PlayMediaIntentResponse()
        if include_optional:
            return PlayMediaIntentResponse(
                var_class = 'PlayMediaIntentResponse',
                code = 'unspecified'
            )
        else:
            return PlayMediaIntentResponse(
                var_class = 'PlayMediaIntentResponse',
                code = 'unspecified',
        )
        """

    def testPlayMediaIntentResponse(self):
        """Test PlayMediaIntentResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
