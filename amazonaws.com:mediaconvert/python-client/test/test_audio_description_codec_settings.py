# coding: utf-8

"""
    AWS Elemental MediaConvert

    AWS Elemental MediaConvert

    The version of the OpenAPI document: 2017-08-29
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.audio_description_codec_settings import AudioDescriptionCodecSettings

class TestAudioDescriptionCodecSettings(unittest.TestCase):
    """AudioDescriptionCodecSettings unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AudioDescriptionCodecSettings:
        """Test AudioDescriptionCodecSettings
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AudioDescriptionCodecSettings`
        """
        model = AudioDescriptionCodecSettings()
        if include_optional:
            return AudioDescriptionCodecSettings(
                aac_settings = None,
                ac3_settings = None,
                aiff_settings = None,
                codec = None,
                eac3_atmos_settings = None,
                eac3_settings = None,
                mp2_settings = None,
                mp3_settings = None,
                opus_settings = None,
                vorbis_settings = None,
                wav_settings = None
            )
        else:
            return AudioDescriptionCodecSettings(
        )
        """

    def testAudioDescriptionCodecSettings(self):
        """Test AudioDescriptionCodecSettings"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
