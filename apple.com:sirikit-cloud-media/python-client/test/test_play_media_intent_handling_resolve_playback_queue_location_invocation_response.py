# coding: utf-8

"""
    SiriKit Cloud Media

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.play_media_intent_handling_resolve_playback_queue_location_invocation_response import PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse

class TestPlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse(unittest.TestCase):
    """PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse:
        """Test PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse`
        """
        model = PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse()
        if include_optional:
            return PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse(
                method = 'PlayMediaIntentHandling.resolvePlaybackQueueLocation',
                result = openapi_client.models.result.result(
                    resolution_result = openapi_client.models.playback_queue_location_resolution_result.PlaybackQueueLocationResolutionResult(
                        class = 'PlaybackQueueLocationResolutionResult', 
                        confirmation_required = openapi_client.models.confirmation_required.confirmationRequired(
                            playback_queue_location_to_confirm = 'unknown', ), 
                        success = openapi_client.models.success.success(
                            resolved_playback_queue_location = 'unknown', ), ), )
            )
        else:
            return PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse(
                method = 'PlayMediaIntentHandling.resolvePlaybackQueueLocation',
                result = openapi_client.models.result.result(
                    resolution_result = openapi_client.models.playback_queue_location_resolution_result.PlaybackQueueLocationResolutionResult(
                        class = 'PlaybackQueueLocationResolutionResult', 
                        confirmation_required = openapi_client.models.confirmation_required.confirmationRequired(
                            playback_queue_location_to_confirm = 'unknown', ), 
                        success = openapi_client.models.success.success(
                            resolved_playback_queue_location = 'unknown', ), ), ),
        )
        """

    def testPlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse(self):
        """Test PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
