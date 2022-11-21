# coding: utf-8

"""
    Transcoder API

    This API converts video files into formats suitable for consumer distribution. 

    The version of the OpenAPI document: v1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.job import Job

class TestJob(unittest.TestCase):
    """Job unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Job:
        """Test Job
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Job`
        """
        model = Job()
        if include_optional:
            return Job(
                config = openapi_client.models.job_config.JobConfig(
                    ad_breaks = [
                        openapi_client.models.ad_break.AdBreak(
                            start_time_offset = '', )
                        ], 
                    edit_list = [
                        openapi_client.models.edit_atom.EditAtom(
                            end_time_offset = '', 
                            inputs = [
                                ''
                                ], 
                            key = '', 
                            start_time_offset = '', )
                        ], 
                    elementary_streams = [
                        openapi_client.models.elementary_stream.ElementaryStream(
                            audio_stream = openapi_client.models.audio_stream.AudioStream(
                                bitrate_bps = 56, 
                                channel_count = 56, 
                                channel_layout = [
                                    ''
                                    ], 
                                codec = '', 
                                mapping = [
                                    openapi_client.models.audio_atom.AudioAtom(
                                        channels = [
                                            openapi_client.models.audio_channel.AudioChannel()
                                            ], 
                                        key = '', )
                                    ], 
                                sample_rate_hertz = 56, ), 
                            key = '', 
                            text_stream = openapi_client.models.text_stream.TextStream(
                                codec = '', 
                                language_code = '', ), 
                            video_stream = openapi_client.models.video_stream.VideoStream(
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
                                width_pixels = 56, ), )
                        ], 
                    inputs = [
                        openapi_client.models.input.Input(
                            key = '', 
                            preprocessing_config = openapi_client.models.preprocessing_config.PreprocessingConfig(
                                audio = openapi_client.models.audio.Audio(
                                    high_boost = True, 
                                    low_boost = True, 
                                    lufs = 1.337, ), 
                                color = openapi_client.models.color.Color(
                                    brightness = 1.337, 
                                    contrast = 1.337, 
                                    saturation = 1.337, ), 
                                crop = openapi_client.models.crop.Crop(
                                    bottom_pixels = 56, 
                                    left_pixels = 56, 
                                    right_pixels = 56, 
                                    top_pixels = 56, ), 
                                deblock = openapi_client.models.deblock.Deblock(
                                    enabled = True, 
                                    strength = 1.337, ), 
                                denoise = openapi_client.models.denoise.Denoise(
                                    strength = 1.337, 
                                    tune = '', ), 
                                pad = openapi_client.models.pad.Pad(
                                    bottom_pixels = 56, 
                                    left_pixels = 56, 
                                    right_pixels = 56, 
                                    top_pixels = 56, ), ), 
                            uri = '', )
                        ], 
                    manifests = [
                        openapi_client.models.manifest.Manifest(
                            file_name = '', 
                            mux_streams = [
                                ''
                                ], 
                            type = 'MANIFEST_TYPE_UNSPECIFIED', )
                        ], 
                    mux_streams = [
                        openapi_client.models.mux_stream.MuxStream(
                            container = '', 
                            encryption = openapi_client.models.encryption.Encryption(
                                aes128 = openapi_client.models.aes128_encryption.Aes128Encryption(
                                    key_uri = '', ), 
                                iv = '', 
                                key = '', 
                                mpeg_cenc = openapi_client.models.mpeg_common_encryption.MpegCommonEncryption(
                                    key_id = '', 
                                    scheme = '', ), 
                                sample_aes = openapi_client.models.sample_aes_encryption.SampleAesEncryption(
                                    key_uri = '', ), ), 
                            file_name = '', 
                            key = '', 
                            segment_settings = openapi_client.models.segment_settings.SegmentSettings(
                                individual_segments = True, 
                                segment_duration = '', ), )
                        ], 
                    output = openapi_client.models.output.Output(
                        uri = '', ), 
                    overlays = [
                        openapi_client.models.overlay.Overlay(
                            animations = [
                                openapi_client.models.animation.Animation(
                                    animation_end = openapi_client.models.animation_end.AnimationEnd(
                                        start_time_offset = '', ), 
                                    animation_fade = openapi_client.models.animation_fade.AnimationFade(
                                        end_time_offset = '', 
                                        fade_type = 'FADE_TYPE_UNSPECIFIED', 
                                        start_time_offset = '', 
                                        xy = openapi_client.models.normalized_coordinate.NormalizedCoordinate(
                                            x = 1.337, 
                                            y = 1.337, ), ), 
                                    animation_static = openapi_client.models.animation_static.AnimationStatic(
                                        start_time_offset = '', ), )
                                ], 
                            image = openapi_client.models.image.Image(
                                alpha = 1.337, 
                                resolution = openapi_client.models.normalized_coordinate.NormalizedCoordinate(
                                    x = 1.337, 
                                    y = 1.337, ), 
                                uri = '', ), )
                        ], 
                    pubsub_destination = openapi_client.models.pubsub_destination.PubsubDestination(
                        topic = '', ), 
                    sprite_sheets = [
                        openapi_client.models.sprite_sheet.SpriteSheet(
                            column_count = 56, 
                            end_time_offset = '', 
                            file_prefix = '', 
                            format = '', 
                            interval = '', 
                            quality = 56, 
                            row_count = 56, 
                            sprite_height_pixels = 56, 
                            sprite_width_pixels = 56, 
                            start_time_offset = '', 
                            total_count = 56, )
                        ], ),
                create_time = '',
                end_time = '',
                failure_details = [
                    openapi_client.models.failure_detail.FailureDetail(
                        description = '', )
                    ],
                failure_reason = '',
                input_uri = '',
                name = '',
                origin_uri = openapi_client.models.origin_uri.OriginUri(
                    dash = '', 
                    hls = '', ),
                output_uri = '',
                priority = 56,
                progress = openapi_client.models.progress.Progress(
                    analyzed = 1.337, 
                    encoded = 1.337, 
                    notified = 1.337, 
                    uploaded = 1.337, ),
                start_time = '',
                state = 'PROCESSING_STATE_UNSPECIFIED',
                template_id = '',
                ttl_after_completion_days = 56
            )
        else:
            return Job(
        )
        """

    def testJob(self):
        """Test Job"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
