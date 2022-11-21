# coding: utf-8

"""
    Transcoder API

    This API converts video files into formats suitable for consumer distribution. 

    The version of the OpenAPI document: v1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.video_stream import VideoStream

class TestVideoStream(unittest.TestCase):
    """VideoStream unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> VideoStream:
        """Test VideoStream
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `VideoStream`
        """
        model = VideoStream()
        if include_optional:
            return VideoStream(
                allow_open_gop = True,
                aq_strength = 1.337,
                b_frame_count = 56,
                b_pyramid = True,
                bitrate_bps = 56,
                codec = '',
                crf_level = 56,
                enable_two_pass = True,
                entropy_coder = '',
                frame_rate = 1.337,
                gop_duration = '',
                gop_frame_count = 56,
                height_pixels = 56,
                pixel_format = '',
                preset = '',
                profile = '',
                rate_control_mode = '',
                tune = '',
                vbv_fullness_bits = 56,
                vbv_size_bits = 56,
                width_pixels = 56
            )
        else:
            return VideoStream(
        )
        """

    def testVideoStream(self):
        """Test VideoStream"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
