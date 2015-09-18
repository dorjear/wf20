<?php

foreach (glob('*Next*') as $file) {
	$target = str_replace('NextforHSBC', '', $file);
	rename($file, $target);
	//rename($file, );
}

