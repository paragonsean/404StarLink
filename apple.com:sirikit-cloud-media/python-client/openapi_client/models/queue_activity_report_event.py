# coding: utf-8

"""
    SiriKit Cloud Media

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class QueueActivityReportEvent(str, Enum):
    """
    QueueActivityReportEvent
    """

    """
    allowed enum values
    """
    LOCAL_DOT_PLAYING_DOT_ELAPSED = 'local.playing.elapsed'
    LOCAL_DOT_PLAYING_DOT_PAUSED = 'local.playing.paused'
    LOCAL_DOT_PLAYING_DOT_CONTINUED = 'local.playing.continued'
    LOCAL_DOT_PLAYING_DOT_SCRUB = 'local.playing.scrub'
    LOCAL_DOT_PLAYING_DOT_FAST_FORWARD = 'local.playing.fastForward'
    LOCAL_DOT_PLAYING_DOT_FAST_REWIND = 'local.playing.fastRewind'
    LOCAL_DOT_PLAYING_DOT_TRANSITIONED_DOT_NATURALLY = 'local.playing.transitioned.naturally'
    LOCAL_DOT_PLAYING_DOT_TRANSITIONED_DOT_SKIP_NEXT = 'local.playing.transitioned.skip_next'
    LOCAL_DOT_PLAYING_DOT_TRANSITIONED_DOT_SKIP_PREVIOUS = 'local.playing.transitioned.skip_previous'
    LOCAL_DOT_PLAYING_DOT_TRANSITIONED_DOT_QUEUE_REPLACED = 'local.playing.transitioned.queue_replaced'
    LOCAL_DOT_STOPPED_DOT_NATURALLY = 'local.stopped.naturally'
    LOCAL_DOT_STOPPED_DOT_SKIP_PAST_END = 'local.stopped.skip_past_end'
    LOCAL_DOT_COMMAND_DOT_LIKE = 'local.command.like'
    LOCAL_DOT_COMMAND_DOT_DISLIKE = 'local.command.dislike'
    LOCAL_DOT_COMMAND_DOT_BOOKMARK = 'local.command.bookmark'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of QueueActivityReportEvent from a JSON string"""
        return cls(json.loads(json_str))


