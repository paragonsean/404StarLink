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

from openapi_client.models.container_settings_m2ts_settings import ContainerSettingsM2tsSettings

class TestContainerSettingsM2tsSettings(unittest.TestCase):
    """ContainerSettingsM2tsSettings unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ContainerSettingsM2tsSettings:
        """Test ContainerSettingsM2tsSettings
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ContainerSettingsM2tsSettings`
        """
        model = ContainerSettingsM2tsSettings()
        if include_optional:
            return ContainerSettingsM2tsSettings(
                audio_buffer_model = None,
                audio_duration = None,
                audio_frames_per_pes = None,
                audio_pids = None,
                bitrate = None,
                buffer_model = None,
                data_pts_control = None,
                dvb_nit_settings = None,
                dvb_sdt_settings = None,
                dvb_sub_pids = None,
                dvb_tdt_settings = None,
                dvb_teletext_pid = None,
                ebp_audio_interval = None,
                ebp_placement = None,
                es_rate_in_pes = None,
                force_ts_video_ebp_order = None,
                fragment_time = None,
                klv_metadata = None,
                max_pcr_interval = None,
                min_ebp_interval = None,
                nielsen_id3 = None,
                null_packet_bitrate = None,
                pat_interval = None,
                pcr_control = None,
                pcr_pid = None,
                pmt_interval = None,
                pmt_pid = None,
                private_metadata_pid = None,
                program_number = None,
                rate_mode = None,
                scte35_esam = None,
                scte35_pid = None,
                scte35_source = None,
                segmentation_markers = None,
                segmentation_style = None,
                segmentation_time = None,
                timed_metadata_pid = None,
                transport_stream_id = None,
                video_pid = None
            )
        else:
            return ContainerSettingsM2tsSettings(
        )
        """

    def testContainerSettingsM2tsSettings(self):
        """Test ContainerSettingsM2tsSettings"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
