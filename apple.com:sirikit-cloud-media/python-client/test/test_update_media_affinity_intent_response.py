# coding: utf-8

"""
    SiriKit Cloud Media

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.update_media_affinity_intent_response import UpdateMediaAffinityIntentResponse

class TestUpdateMediaAffinityIntentResponse(unittest.TestCase):
    """UpdateMediaAffinityIntentResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UpdateMediaAffinityIntentResponse:
        """Test UpdateMediaAffinityIntentResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UpdateMediaAffinityIntentResponse`
        """
        model = UpdateMediaAffinityIntentResponse()
        if include_optional:
            return UpdateMediaAffinityIntentResponse(
                var_class = 'UpdateMediaAffinityIntentResponse',
                code = 'unspecified'
            )
        else:
            return UpdateMediaAffinityIntentResponse(
                var_class = 'UpdateMediaAffinityIntentResponse',
                code = 'unspecified',
        )
        """

    def testUpdateMediaAffinityIntentResponse(self):
        """Test UpdateMediaAffinityIntentResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
